package com.accp.controller;

<<<<<<< HEAD
=======
import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

>>>>>>> oxw
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
<<<<<<< HEAD

import com.accp.domain.Staff;
import com.accp.domain.Store;
import com.accp.service.StaffService;
import com.github.pagehelper.PageInfo;

@Controller
public class StaffController {
	@Autowired
	StaffService staffService;
	
	/**
	 * 员工分页查询
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@RequestMapping("/staffqueryAll")
	@ResponseBody
	public PageInfo<Staff> staffqueryAll(Integer pageNum, Integer pageSize,String staffname) {
		if(pageNum   == null) {
			pageNum = 1 ;   
		}
		if(pageSize   == null) {
			pageSize = 1 ; 
		}
		PageInfo<Staff> page = staffService.staffqueryAll(pageNum, pageSize,staffname);
		System.out.println(page.toString());
		return page;
	}
	

=======
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
	
>>>>>>> oxw
}
