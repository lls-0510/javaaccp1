package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Good;
import com.accp.domain.Shop;
import com.accp.domain.Vip;
import com.accp.service.ShopSyService;

@Controller
public class ShopSyController {
	
	@Autowired
	private ShopSyService service;
	
	
	@RequestMapping("/queryAllOxw")
	@ResponseBody
	public List<Shop> queryAll(){
		return service.queryAll();
	}
	
	@RequestMapping("/queryByIdOxw")
	@ResponseBody
	public Shop queryByIdOxw(Integer sid){
		return service.queryById(sid);
	}
	

	@RequestMapping("/queryByGoodidOxw")
	@ResponseBody
	public List<Shop> queryByGoodIdOxw(Integer goodid){
		return service.queryByGoodid(goodid);
	}
	
	@RequestMapping("/queryBySnameOxw")
	@ResponseBody
	public List<Shop> queryBySnameOxw(String sname){
		return service.queryBySname(sname);
	}
	
	
	@RequestMapping("/queryGoodOxw")
	@ResponseBody
	public List<Good> queryGood(){
		return service.queryGood();
	}
	
	@RequestMapping("/queryAllVipOxw")
	@ResponseBody
	public List<Vip> queryAllVipOxw() {
		return service.queryAllVip();
	}
}
