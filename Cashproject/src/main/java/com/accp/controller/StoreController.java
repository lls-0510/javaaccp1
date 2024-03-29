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
	/**
	 * 新增店铺文件上传
	 * @param insertFiles
	 * @param shop
	 * @return
	 */
	@RequestMapping("/uploadAjax")
	@ResponseBody
	public String uploadAjax(MultipartFile[] insertFiles,Store shop) {
		shop.setDitem(shop.getProvince()+shop.getCity()+shop.getArea());
		
		File directory = new File("D:/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
			for(MultipartFile l : insertFiles) {
				String url = "D:/images/";
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
	/**
	 * 查询店铺
	 * @return
	 */
	@RequestMapping("/queryStore")
	@ResponseBody
	public List<Store>queryStore(){
		System.out.println();
		return storeService.queryStore();
	}
	
	/**
	 * 修改店铺信息id
	 * @param id
	 * @return
	 */
	@RequestMapping("/upqueryById")
	@ResponseBody
	public Store queryById(Integer id){
		return storeService.queryById(id);
	}
	/**
	 * 修改店铺信息
	 * @param shop
	 * @return
	 */
	@RequestMapping("/updatestore")
	@ResponseBody
	public int updatestore(String people,String phone,String telephone,String starTime,
    String endTime,String province,String city,String area,String ditem,
    String storename,String card,String remark,String jcname,Integer id) {
		int i=storeService.updatestore(people, phone, telephone, starTime, endTime, province, city, area, ditem, storename, card, remark, jcname, id);
		if(i>0) {
			return 000;
		}else {
			return 111;
		}
	}
	/**
	 * 删除店铺信息
	 * @param shop
	 * @return
	 */
	@RequestMapping("/deletestore")
	@ResponseBody
	public int deletestore(Integer id) {
		return storeService.deletestore(id);
	}
	 

}
