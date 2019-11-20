package com.accp.service;

import java.util.List;

import org.apache.catalina.StoreManager;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Store;
import com.accp.mapper.StoreMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StoreService {
	@Autowired
	private StoreMapper storeMapper;
	
	/**
	 * 店铺信息分页
	 * @return
	 */
	public PageInfo<Store> storequeryAll(Integer pageNum, Integer pageSize){
		Page page = PageHelper.startPage(pageNum, pageSize);
		storeMapper.storequeryAll();
		 return page.toPageInfo();
	}
	
	public int insertstore(Store shop) {
		return storeMapper.insert(shop);
	}
	
	public List<Store> queryStore(){
		return storeMapper.selectByExample(null);
	}
	
	public Store queryById(Integer id) {
		return storeMapper.selectByPrimaryKey(id);
	}
	
	public int updatestore(String people,String phone,String telephone,String starTime,
		    String endTime,String province,String city,String area,String ditem,
		    String storename,String card,String remark,String jcname,Integer id) {
		return storeMapper.updatestore(people, phone, telephone, starTime, endTime, province, city, area, ditem, storename, card, remark, jcname, id);
	}
	
	public int deletestore(Integer id) {
		return storeMapper.deleteByPrimaryKey(id);
	}

}
