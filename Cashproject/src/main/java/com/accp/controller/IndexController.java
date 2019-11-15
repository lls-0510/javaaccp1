package com.accp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	/**
	 * 用于跳转页面
	 * @return
	 */
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/go")
	public String go(String htmlName) {
		return htmlName;
	}
 
}
