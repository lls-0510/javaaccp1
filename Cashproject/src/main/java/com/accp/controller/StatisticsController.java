package com.accp.controller;

import java.util.Hashtable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Statistics;
import com.accp.service.StatisticsService;

@Controller
public class StatisticsController {
	@Autowired
	StatisticsService statisticsService;
	
	@RequestMapping("/queryStatistics")
	@ResponseBody
	public Hashtable<String, List<Statistics>> queryStatistics(){
		Hashtable<String, List<Statistics>> table=statisticsService.queryStatistics();
		System.out.println("统计"+table);
		return table;
		
	}

}
