package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Staff;
import com.accp.domain.Store;
import com.accp.mapper.StaffMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StaffService {
	@Autowired
	private StaffMapper staffMapper;
	
	/**
	 * 店铺信息分页
	 * @return
	 */
	public PageInfo<Staff> staffqueryAll(Integer pageNum, Integer pageSize,String staffname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		staffMapper.staffqueryAll("%"+staffname+"%");
		 return page.toPageInfo();
	}
	

}