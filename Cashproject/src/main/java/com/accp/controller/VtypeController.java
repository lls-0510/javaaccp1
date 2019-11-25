package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Vtype;
import com.accp.service.VtypeService;

@Controller
public class VtypeController {
	@Autowired
	VtypeService vtypeService;
	
	@RequestMapping("/vtypequeryAll")
	@ResponseBody
	public List<Vtype> vtypequeryAll(){
		return vtypeService.queryAll();
	}

}
