package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Supplier;
import com.accp.domain.Vip;
import com.accp.domain.VipCount;
import com.accp.service.VipService;
import com.github.pagehelper.PageInfo;

@Controller
public class VipController {
	@Autowired
	VipService vipService;
	
	/**
	 * 会员分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/Vipcount")
	@ResponseBody
	public PageInfo<VipCount>Vipcount(Integer pageNum, Integer pageSize,String vname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<VipCount> page = vipService.Vipcount(pageNum, pageSize, vname);
		System.out.println(page.toString());
		return page;
	}
	
	/**
	 * 会员新增信息
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/insertvip")
	@ResponseBody
	public int insertvip(Vip record) {
		return vipService.insertvip(record);
	}

}
