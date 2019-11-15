package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Productinfo;
import com.accp.domain.Supplier;
import com.accp.service.SupplierService;
import com.github.pagehelper.PageInfo;

@Controller
public class SuppController {
	
	@Autowired
	SupplierService supplierService;
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/suppqueryAll")
	@ResponseBody
	public PageInfo<Supplier>suppqueryAll(Integer pageNum, Integer pageSize,String Suname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<Supplier> page = supplierService.suppqueryAll(pageNum, pageSize, Suname);
		System.out.println(page.toString());
		return page;
	}

}
