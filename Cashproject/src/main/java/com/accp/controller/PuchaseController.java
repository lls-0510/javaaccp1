package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Purchase;
import com.accp.service.PurchaseService;
import com.github.pagehelper.PageInfo;

@Controller
public class PuchaseController {
	@Autowired
	PurchaseService purchaseService;
	
	/**
	 * 分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/purchppqueryAll")
	@ResponseBody
	public PageInfo<Purchase>purchppqueryAll(Integer pageNum, Integer pageSize,String suname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<Purchase> page = purchaseService.purchasequeryAll(pageNum, pageSize, suname);
		System.out.println(page.toString());
		return page;
	}
	
	/**
	 * 创建流水号
	 * @param deliverytime
	 * @return
	 */
	@RequestMapping("/findMax")
	@ResponseBody
	public String findMax(String deliverytime) {
		String str=purchaseService.findMax(deliverytime);
		deliverytime=deliverytime.replaceAll("-", "");
		return deliverytime+str;
				
	}
	
	/**
	 * 删除采购单
	 * @param deliverytime
	 * @return
	 */
	@RequestMapping("/deletePushase")
	@ResponseBody
	public int deletePushase(Integer purchaseid) {
		return purchaseService.deletePushase(purchaseid);
	}
	
	/**
	 * 查询采购单id
	 * @param deliverytime
	 * @return
	 */
	@RequestMapping("/purchasequeryAllById")
	@ResponseBody
	public  List<Purchase> purchasequeryAllById(Integer purchaseid) {
		System.out.println("进来了采购单查询");
		return purchaseService.purchasequeryAllById(purchaseid);
	}

}
