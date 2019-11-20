package com.accp.service;

import java.util.List;

import org.apache.catalina.StoreManager;
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
	
	public List<Store>queryStore(){
		return storeMapper.selectByExample(null);
	}

}
