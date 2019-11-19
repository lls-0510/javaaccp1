package com.accp.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Staff;
import com.accp.service.StaffService;

@Controller
public class StaffController {

	@Autowired
	private StaffService service;
	
	//显示账户
	@RequestMapping("/queryByName")
	@ResponseBody
	public Staff queryByName(HttpSession hs) {
		String name = hs.getAttribute("username").toString();
		return service.queryByName(name);
	}
	
	
	//文件上传
	/*
	 * @RequestMapping("/uploadAjax")
	 * 
	 * @ResponseBody public String uploadAjax(MultipartFile [] files) { File
	 * directory = new File("/Users/tangyong/upload"); if(!directory.exists()) {
	 * directory.mkdirs(); } try { for(MultipartFile l : files) { String url =
	 * "/Users/tangyong/upload/"; url = url+"/"+l.getOriginalFilename(); File f =
	 * new File(url); l.transferTo(f); } System.out.println("to成功了"); } catch
	 * (IllegalStateException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); } catch (IOException e) { // TODO Auto-generated catch
	 * block e.printStackTrace(); } return "success"; }
	 */
	
	//修改账户
	
}
