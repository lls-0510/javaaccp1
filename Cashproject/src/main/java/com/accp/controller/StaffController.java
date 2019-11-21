package com.accp.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.service.StaffService;
import com.github.pagehelper.PageInfo;

@Controller
public class StaffController {
	
	@Autowired
	private StaffService service;
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
		PageInfo<Staff> page = service.staffqueryAll(pageNum, pageSize,staffname);
		System.out.println(page.toString());
		return page;
	}
	
	
	//显示账户
	@RequestMapping("/queryByNames")
	@ResponseBody
	public Staff queryByNames(HttpSession hs) {
		String name = hs.getAttribute("username").toString();
		System.out.println("进入了");
		return service.queryByName(name);
	}
	
	
	//文件上传
	@RequestMapping("/uploadAjaxOxw")
	@ResponseBody
	public String uploadAjax(MultipartFile files,HttpSession hs) {
		String name = hs.getAttribute("username").toString();
		Staff s  = service.queryByName(name);
		String staffid = s.getStaffid().toString();
		File directory = new File("D:/images");
		if(!directory.exists()) {
			directory.mkdirs();
		}
		try {
				String url = "D:/images";
				url = url+"/"+files.getOriginalFilename();
				File f = new File(url);
				files.transferTo(f);
				service.updateHead(staffid, files.getOriginalFilename());
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	//修改账户
	@RequestMapping("updateStaff")
	@ResponseBody
	public int updateStaff(@RequestBody Staff sf,HttpSession hs) {
		User u = (User) hs.getAttribute("user");
		hs.setAttribute("username", sf.getStaffname());
		return service.update(sf,u.getUserid());
	}
}

