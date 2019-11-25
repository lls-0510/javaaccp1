package com.accp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Purchase;
import com.accp.service.PurchaseService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class purchaseController {
	
	@Autowired 
	PurchaseService purchaseService ; 
	
	@RequestMapping("/getpurs")
	@ResponseBody 
	public PageInfo<Purchase> getpurs(Integer pagenum,String startDate,String endDate,Integer gysid,String bz){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			if(pagenum == null) {
				pagenum = 1;
			}
			if(startDate == null || startDate == "") {
				startDate = "1970-1-1";
			}
			if(endDate == null || endDate == "") {
				endDate = sdf.format(new Date());
			}
			if(gysid == null ) {
				gysid = 0 ; 
			} 
			if(bz == null || bz == "") {
				bz = "";
			}
			PageHelper.startPage(pagenum,15);
			PageInfo<Purchase> page = new PageInfo<Purchase>(this.purchaseService.queryPurchases(sdf.parse(startDate), sdf.parse(endDate), gysid, bz));
			return page;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null ; 
	}

	@RequestMapping("/delpur")
	@ResponseBody
	public String delpur(Integer prid){
		this.purchaseService.delpur(prid);
		return "true";
	}

	@RequestMapping("/querypru")
	@ResponseBody
	public Purchase querypru(Integer prid){
		return this.purchaseService.queryPurchase(prid);
	}

	@RequestMapping("/findMax")
	@ResponseBody
	public String findMax(String date){
		String str=purchaseService.findMax(date);
		date=date.replaceAll("-", "");
		return date+str;
	}

	@RequestMapping("/addpur")
	@ResponseBody
	public  String addpur(@RequestBody Purchase purchase){
		purchaseService.addpur(purchase);
		return "success";
	}

	@RequestMapping("/updatepur")
	@ResponseBody
	public  String updatepur(@RequestBody Purchase purchase){
		this.purchaseService.updatepur(purchase);
		return "success";
	}
}
