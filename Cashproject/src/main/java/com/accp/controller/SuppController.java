package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Good;
import com.accp.domain.Productinfo;
import com.accp.domain.Supplier;
import com.accp.service.SupplierService;
import com.github.pagehelper.PageInfo;

@Controller
public class SuppController {
	
	private static final List<Supplier> Supplier = null;
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
	/**
	 * 新增供应商
	 * @param record
	 * @return
	 */
	@RequestMapping("/insertsupplier")
	public String insertsupplier(Supplier record) {
		supplierService.insertsupplier(record);
		return "index";
		
	}
	
	/**
	 * 修改供应商信息
	 * @param record
	 * @return
	 */
	@RequestMapping("/sudoupdate")
	@ResponseBody
	public int sudoupdate(String suname,String sucompany,String people,String phone,String email,String telephone,String province,String city,String area,Integer suid) {
		System.out.println(suid);
		int i=supplierService.sudoupdate(suname, sucompany, people, phone, email, telephone, province, city, area, suid);
		
		if(i>0) {
			return 000;
		}else {
			return 111;
		}
		 
	}
	
	/**
	 * 新增供应商
	 * @param record
	 * @return
	 */
	@RequestMapping("/deletesupplie")
	@ResponseBody
	public int deletesupplie(Integer suid) {
		return supplierService.deletesupplie(suid);
	}
	
	/**
	 * 查询商品类型id
	 * @param goodid
	 * @param model
	 * @return
	 */
	@RequestMapping("/suqueryById")
	@ResponseBody
	public Supplier suqueryById(Integer suid,Model model) {
		model.addAttribute("suid",suid);
		System.out.println("供应商"+suid);
		Supplier clazz=supplierService.suqueryById(suid);
		return clazz;
	}
	
	@RequestMapping("/queryByName")
	@ResponseBody
	public List<Supplier> queryByName() {
		return supplierService.queryByName();
		
	}

}
