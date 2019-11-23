package com.accp.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Good;
import com.accp.domain.Shop;
import com.accp.domain.Size;
import com.accp.service.shopUploadService;

@Controller
public class shopUploadController {

	// 尺寸操作
	@Autowired
	shopUploadService shopUploadService; // 尺寸

	@RequestMapping("/getSize")
	@ResponseBody 
	public List<Size> getSize() {
		return shopUploadService.queryAllSize();
	}

	
	  @RequestMapping("/addsize")
	  @ResponseBody
	  public String addsize(@RequestBody List<Size> sizes) {
		  	shopUploadService.addsize(sizes);
		  	return "success"; 
	  } 
	    
	  // 商品类别  
	  @RequestMapping("/getgType")
	  @ResponseBody
	  public List<Good> getgType(){
		  return this.shopUploadService.queryAllGtype();
	  }
	  
	  
	  @RequestMapping("/addshop")
	  @ResponseBody  
	  public String addshop(@RequestBody Shop shop) {
		  shopUploadService.addshop(shop);
		  return "success";
	  }
	  
	  
	   @RequestMapping("/uploadsimg") 
		@ResponseBody
		public String uploadAjax(MultipartFile [] files) {
			File directory = new File("D:\\images");
			if(!directory.exists()) {
				directory.mkdirs();
			} 
			String urls  = "";
			try {
				for(MultipartFile l : files) {
					String url = "D:\\images";
					url = url+"/"+l.getOriginalFilename();
					if(urls.equals("")) {
						urls = url ; 
					}else {
						urls = urls+","+url ; 
					}
					File f = new File(url);
					l.transferTo(f);
				} 
				System.out.println("to成功了");
			} catch (IllegalStateException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return urls; 
		}
}
