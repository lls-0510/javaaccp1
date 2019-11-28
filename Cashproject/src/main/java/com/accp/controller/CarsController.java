package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Car;
import com.accp.domain.Cars;
import com.accp.service.CarsService;
import com.github.pagehelper.PageInfo;

@Controller
public class CarsController {
	
	@Autowired
	private CarsService carsService;
	
	@RequestMapping("/carsqueryAll")
	@ResponseBody
	public PageInfo<Cars>carsqueryAll(Integer pageNum, Integer pageSize,String goodname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<Cars> page = carsService.suppqueryAll(pageNum, pageSize, goodname);
		System.out.println(page.toString());
		return page;
	}
	
	@RequestMapping("/queryByCarsid")
	@ResponseBody
	public Car queryBycarsid(Integer carid){
		return carsService.queryByCarsid(carid);
	}
	@RequestMapping("/deleteByCarsid")
	@ResponseBody
	public int  deleteByCarsid(Integer carsid){
		return carsService.deletecars(carsid);
	}
}
