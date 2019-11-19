package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Integral;
import com.accp.domain.Vtype;
import com.accp.mapper.IntegralMapper;
import com.accp.service.levelService;

@Controller
public class levelController {

	@Autowired
	levelService levelService; 
	
	@RequestMapping("/getlevels")
	@ResponseBody  
	public List<Vtype> queryAll(){
		return levelService.queryAll(); 
	}
	
	@RequestMapping("/addlevel")
	@ResponseBody 
	public String addlevel(@RequestBody Vtype vtype) {
		levelService.addlevel(vtype);
		return "success";
	}
	
	@RequestMapping("/dellevel")
	@ResponseBody  
	public String dellevel(String tid) {
		levelService.dellevel(tid);
		return "success";
	}
	
	@RequestMapping("/updatelevel")
	@ResponseBody 
	public String updatelevel(@RequestBody Vtype vtype) {
		levelService.updatelevel(vtype);
		return "success";
	}
	
	@RequestMapping("/getlevel")
	@ResponseBody
	public Vtype getlevel(String vid) {
		return levelService.queryByvid(vid);
	}
	
	
	/////////////////////  积分设置  
	
	
	@RequestMapping("/getintegra")
	@ResponseBody 
	public Integral getintegra() {
		return levelService.queryIntegra(); 
	}
	
	@RequestMapping("/updateintegra")
	@ResponseBody  
	public String updateintegra(@RequestBody Integral integral) {
		levelService.updateIntegra(integral);  
		return "success";
	}
}
