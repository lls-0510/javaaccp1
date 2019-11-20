package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Good;
import com.accp.domain.Shop;
import com.accp.domain.Shopdetails;
import com.accp.domain.Size;
import com.accp.mapper.GoodMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.ShopdetailsMapper;
import com.accp.mapper.SizeMapper;


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
		shopMapper.insert(shop);    
		for (Shopdetails Shopdetail: shop.getShopd()) {
			Shopdetail.setSid(shop.getSid());
			shopdetailsMapper.insert(Shopdetail);
		}
		return true; 
	}
}
