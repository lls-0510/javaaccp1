package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Store;
import com.accp.service.StoreService;
import com.github.pagehelper.PageInfo;

@Controller
public class StoreController {
	@Autowired
	StoreService storeService;
	
	/**
	 * 店铺分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/storequeryAll")
	@ResponseBody
	public PageInfo<Store> proqueryAll(Integer pageNum, Integer pageSize) {
		PageInfo<Store> page = storeService.storequeryAll(pageNum, pageSize);
		System.out.println(page.toString());
		return page;
	}
	
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile[] insertFiles,Store shop) {
		shop.setDitem(shop.getProvince()+shop.getCity()+shop.getArea());
		
		File directory = new File("D:/Gitproject/javaaccp1/Cashproject/src/main/resources/static/images/flie");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : insertFiles) {
				String url = "D:/Gitproject/javaaccp1/Cashproject/src/main/resources/static/images/flie/";
				url = url+"/"+l.getOriginalFilename();
				File f = new File(url);
				l.transferTo(f);
				System.out.println(l.getOriginalFilename());
				shop.setImg(l.getOriginalFilename());
			}
			System.out.println("进来了文件上传");
		} catch (IllegalStateException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		storeService.insertstore(shop);
		return "success";
	}
	
	@RequestMapping("/queryStore")
	@ResponseBody
	public List<Store>queryStore(){
		return storeService.queryStore();
	}
	 

}
