package com.accp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Model;
import com.accp.domain.User;
import com.accp.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService service;
	
	/*@RequestMapping("/login")
	@ResponseBody
	public User login(String username,String userpwd,HttpSession hs) {
		hs.setAttribute("username", username);
		User u = service.login(username, userpwd);
		hs.setAttribute("user", u);
		return u;
		
	}*/
	
	//登录验证
			@RequestMapping("/login")
			@ResponseBody
			public String logins(String username,String userpwd,HttpSession hs) {
				User uu=new User(username,userpwd);
				User user=service.login(uu);
				hs.setAttribute("username", username);
				hs.setAttribute("user", user);
				System.out.println(user != null);
				if(user!=null) {
					String code = (String) hs.getAttribute("code");
						List<Model> shopall=service.selectShopAllByjobnumber(username);
					
						hs.setAttribute("zwdqx", shopall);
						System.out.println();
						hs.setAttribute("user", user);
						return "0";
					
				}else {
					return "2";
				}
			}
			
			//查询用户 权限
			@RequestMapping("/cxcsope")
			@ResponseBody
			public List<Model> selectsope(HttpSession session) {
				List<Model> shopall=(List<Model>) session.getAttribute("zwdqx");
				return shopall;
			}
}
