package com.accp.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Turnover;
import com.accp.domain.User;
import com.accp.service.TurnService;

@Controller
public class TurnController {
	
	@Autowired
	private TurnService service; 
	
	@RequestMapping("/insertTurnOxw")
	@ResponseBody
	public int insertTurn(@RequestBody Turnover t,HttpSession hs) {
		User u =(User)hs.getAttribute("user");
		t.setPhone("11111111111111");
		t.setUserId(1);
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:SS");
			Calendar cd = Calendar.getInstance();
			t.setOrderDate(cd.getTime());
			t.setOrderPayment("微信支付");
		return service.insertTurn(t);
	}
}
