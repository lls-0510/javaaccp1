package com.accp.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Statistics;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.StatisticsMapper;

@Service
@Transactional
public class StatisticsService {
	
	@Autowired
	private StatisticsMapper statisticsMapper;
	/**
	 * 统计成交量
	 * @return
	 */
	public Hashtable<String, List<Statistics>>queryStatistics(){
		Hashtable<String, List<Statistics>> table=new Hashtable<String, List<Statistics>>();
		Date date=new Date();
		int number1=0;
		int number2=0;
		int num=date.getDay();
		if(num==0){
			number1=-6;
			number2=0;
		}else{
			number1=-(num-1);
			number2=7-num;
		}
		//本周第一天
		String d1=getDateByDateAndNum(date,number1);
		System.out.println(d1);
		//本周最后一天
		String d2=getDateByDateAndNum(date,number2);
		System.out.println(d2);
		String d3=getDateByDateAndNum(date,-7);
		//上周第一天
		String d4="";
		//上周最后一天
		String d5="";
		/*System.out.println(d3);*/
		try {
			Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(d3);
			d4=getDateByDateAndNum(date2,number1);
			System.out.println(d4);
			d5=getDateByDateAndNum(date2,number2);
			System.out.println(d5);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//本周数据
		List<Statistics> thisweek=statisticsMapper.queryAllStatistic(d1, d2);
		//上周数据
		List<Statistics> lastweek=statisticsMapper.queryAllStatistic(d4, d5);
		table.put("thisweek", thisweek);
		table.put("lastweek", lastweek);
		return table;
		
	}
	public static String getDateByDateAndNum(Date date,int number){
		Calendar cl=Calendar.getInstance();//获取时间对象
		cl.setTime(date);
		cl.add(Calendar.DATE, number);
		return new SimpleDateFormat("yyyy-MM-dd").format( cl.getTime());
	}


}
