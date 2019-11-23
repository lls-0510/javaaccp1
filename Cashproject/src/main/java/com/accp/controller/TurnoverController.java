package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Supplier;
import com.accp.domain.TurnoverCount;
import com.accp.service.TurnoverService;
import com.github.pagehelper.PageInfo;

@Controller
public class TurnoverController {
	@Autowired
	TurnoverService turnoverService;
	
	/**
	 * 成交记录分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/queryTurnover")
	@ResponseBody
	public PageInfo<TurnoverCount>queryTurnover(Integer pageNum, Integer pageSize,String ordername) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		System.out.println("建立");
		PageInfo<TurnoverCount> page = turnoverService.queryTurnover(pageNum, pageSize, ordername);
		System.out.println(page.toString());
		return page;
	}
	/**
	 * 查询成交总数量
	 * @return
	 */
	@RequestMapping("/queryNum")
	@ResponseBody
	public  List<TurnoverCount>queryNum(){
		return turnoverService.queryNum();
	}
	
	/**
	 * 查询成交总金额
	 * @return
	 */
	@RequestMapping("/queryprice")
	@ResponseBody
	public List<TurnoverCount>queryprice(){
		return turnoverService.queryprice();
	}
	
	
	
	
	

}
