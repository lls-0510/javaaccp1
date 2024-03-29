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
	@RequestMapping("updateStaffOxw")
	@ResponseBody
	public int updateStaff(@RequestBody Staff sf,HttpSession hs) {
		User u = (User) hs.getAttribute("user");
		hs.setAttribute("username", sf.getStaffname());
		return service.update(sf,u.getUserid());
	}
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

	/**
	 * 员工信息修改id
	 * @param staffid
	 * @returns
	 */
	@RequestMapping("/staffqueryById")
	@ResponseBody
	public  Staff staffqueryById(Integer staffid){
		return service.staffqueryById(staffid);
	}
	/**
	 * 员工信息修改
	 * @param staffid
	 * @returns
	 */
	@RequestMapping("/updateStaff")
	@ResponseBody
	public int updateStaff(String staffname,String staffpwd,String staffphone,
			String headportrait,String industry,
			String cardgo,Integer staffid) {
				int i= service.updateStaff(staffname, staffpwd, staffphone, headportrait, industry, cardgo, staffid);
				if(i>0) {
					return 000;
				}else { 
					return 111;
				}
			}
	/**
	 * 员工信息新增
	 * @param staffid
	 * @returns
	 */
	@RequestMapping("/insertStaff")
	@ResponseBody
	public int insertStaff(Staff record) {
		int i= service.insertStaff(record);
		if(i>0) {
			return 000;
		}else {
			return 111;
		}
	}
	/**
	 * 员工信息删除
	 * @param staffid
	 * @returns
	 */
	@RequestMapping("/deleteStaff")
	@ResponseBody 
	public int deleteStaff(Integer staffid) {

		return service.deleteStaff(staffid);
	}
	
	

}

