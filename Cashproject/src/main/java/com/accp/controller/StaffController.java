package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Staff;
import com.accp.domain.Store;
import com.accp.service.StaffService;
import com.github.pagehelper.PageInfo;

@Controller
public class StaffController {
	@Autowired
	StaffService staffService;
	
	/**
	 * 员工分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/staffqueryAll")
	@ResponseBody
	public PageInfo<Staff> staffqueryAll(Integer pageNum, Integer pageSize,String staffname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<Staff> page = staffService.staffqueryAll(pageNum, pageSize,staffname);
		System.out.println(page.toString());
		return page;
	}
	

}
