package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Shop;
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
}
