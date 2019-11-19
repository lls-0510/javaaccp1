package com.accp.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.User;
import com.accp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping("/login")
	@ResponseBody
	public User login(String username,String userpwd,HttpSession hs) {
		hs.setAttribute("username", username);
		return service.login(username, userpwd);
	
	}
}
