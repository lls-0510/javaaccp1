package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Productinfo;
import com.accp.domain.Supplier;
import com.accp.mapper.SupplierMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SupplierService {
	@Autowired
	private SupplierMapper supplierMapper;
	
	/**
	 * 供应商信息分页
	 * @return
	 */
	public PageInfo<Supplier> suppqueryAll(Integer pageNum, Integer pageSize,String Suname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		supplierMapper.suppqueryAll("%"+Suname+"%");
		 return page.toPageInfo();
	}
	 
	
	

}
