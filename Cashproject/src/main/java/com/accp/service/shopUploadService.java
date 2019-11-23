package com.accp.service;

import java.util.ArrayList;
import java.util.List;

import com.accp.domain.*;
import com.accp.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class shopUploadService {

	//尺寸操作
	@Autowired 
	SizeMapper sizMapper;  //尺寸  
	
	/**
	 * 查询所有尺寸
	 * @return
	 */
	public List<Size> queryAllSize(){
		return sizMapper.selectByExample(null); 
	}
	
	/**
	 * 尺寸保存
	 */
	
	public boolean addsize(List<Size> sizes) {
		sizMapper.deleteAll();//先删除全部  
		for (Size size : sizes) {  //循环 判断 
			size.setId(size.getId());   //重新获取有的 让它之前的id不更改 没有的就自增 
			sizMapper.insert(size);  
		}
		return true ; 
	}
	//  商品类别 
	@Autowired  
	GoodMapper goodMapper;  
	 
	public List<Good> queryAllGtype(){
		return goodMapper.selectByExample(null);
	}
	
	@Autowired 
	ShopMapper shopMapper;  
	@Autowired  
	ShopdetailsMapper shopdetailsMapper;  
	
	public boolean addshop(Shop shop) {
		if(shopMapper.selectByPrimaryKey(shop.getSid())==null) { //添加
			shopMapper.insert(shop);
			if(shop.getShopd() !=null){
				for (Shopdetails Shopdetail: shop.getShopd()) {
					Shopdetail.setSid(shop.getSid());
					shopdetailsMapper.insert(Shopdetail);
				}
			}

		}else {  //修改
			for (Shopdetails Shopdetail: shop.getShopd()) {
				if(shopdetailsMapper.selectByPrimaryKey(Shopdetail.getSdid())!=null) {
					shopdetailsMapper.updateByPrimaryKey(Shopdetail);
				}else {
					Shopdetail.setSid(shop.getSid());
					shopdetailsMapper.insert(Shopdetail);
				}
			} 
			shopMapper.updateByPrimaryKey(shop);  
		}
		return true; 
	}
	
	
	//商品管理 
	
	/**
	  * 查询所有 
	 * @return
	 */
	public List<Shop> queryAllShop(Integer goodid,String sname,Integer sroreid){
		List<Shop> shops = new ArrayList<Shop>(); 
		if(goodid > 0) {  
			ShopExample se = new ShopExample(); 
			se.createCriteria().andGoodidEqualTo(goodid).andSnameLike("%"+sname+"%").andBz1EqualTo(sroreid+"");
			shops = shopMapper.selectByExample(se);
		}else {
			ShopExample se = new ShopExample(); 
			se.createCriteria().andSnameLike("%"+sname+"%").andBz1EqualTo(sroreid+"");
			shops = shopMapper.selectByExample(se);  
		}  
		for (Shop shop : shops) { 
			System.out.println(shop.getGoodimg().split(",")[0]);
			shop.setGoodimg(shop.getGoodimg().split(",")[0]);
			ShopdetailsExample dte = new ShopdetailsExample(); 
			dte.createCriteria().andSidEqualTo(shop.getSid()); 
			shop.setShopd(shopdetailsMapper.selectByExample(dte));
			int kc = 0 ; 
			for (Shopdetails shopd : shopdetailsMapper.selectByExample(dte)) {
				kc = kc + shopd.getSnum(); 
			}
			shop.setKc(kc);
			shop.setGood(goodMapper.selectByPrimaryKey(shop.getGoodid()));
		}
		return shops;
	}
	/**
	  * 单个查询
	 * @return
	 */
	public Shop queryAllShopbysid(Integer sid){
			Shop shops = shopMapper.selectByPrimaryKey(sid);
			ShopdetailsExample dte = new ShopdetailsExample(); 
			dte.createCriteria().andSidEqualTo(shops.getSid()); 
			shops.setShopd(shopdetailsMapper.selectByExample(dte));
			shops.setGood(goodMapper.selectByPrimaryKey(shops.getGoodid()));
		return shops;
	}
	
	/**
	 * 删除商品
	 * @param sid
	 * @return
	 */
	public boolean delshop(Integer sid) {
		ShopdetailsExample dte = new ShopdetailsExample(); 
		dte.createCriteria().andSidEqualTo(sid);
		shopdetailsMapper.deleteByExample(dte);
		shopMapper.deleteByPrimaryKey(sid); 
		return true; 
	}

	/**
	 * 查询店铺
	 */
	@Autowired
	StoreMapper storeMapper ;
	public List<Store>  queryStore(){
		return storeMapper.selectByExample(null);
	}
	
	
}
