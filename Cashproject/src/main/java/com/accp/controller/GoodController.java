package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Good;
import com.accp.service.GoodService;

@Controller
public class GoodController {
	@Autowired
	GoodService goodService;
	
	/**
	 * 查询商品类型
	 * @return
	 */
	@RequestMapping("/queryAll")
	@ResponseBody
	public List<Good> queryAll(){
		return goodService.queryAll();
	}
	
	/**
	 * 新增商品类型
	 * @return
	 */
	@RequestMapping("/addGoodType")
	@ResponseBody
	public String addGoodType(@RequestBody String Goodname) {
		goodService.addGoodType(Goodname);
		return "success";
	}
	
	/**
	 * 删除商品类型
	 * @return
	 */
	@RequestMapping("/deleteGoodType")
	@ResponseBody
	public  String deleteGoodType(Integer goodid) {
		goodService.deleteGoodType(goodid);
		return "success";
	}
	
	@RequestMapping("/queryById")
	@ResponseBody
	public Good doupate(Integer goodid,Model model) {
		model.addAttribute("goodid",goodid);
		System.out.println(goodid);
		Good clazz=goodService.queryById(goodid);
		return clazz;
	}
	
	@RequestMapping("/doupdate")
	@ResponseBody
	public String updateGoodType(String Goodname,Integer goodid) {
		goodService.updateGoodType(Goodname, goodid);
		return "success";
	}

}
