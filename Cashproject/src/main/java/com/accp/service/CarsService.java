package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Car;
import com.accp.domain.Cars;
import com.accp.domain.CarsExample;
import com.accp.domain.Supplier;
import com.accp.mapper.CarMapper;
import com.accp.mapper.CarsMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class CarsService {
	
	@Autowired
	private CarsMapper carsMapper;
	
	@Autowired  
	CarMapper carMapper;  
	
	public PageInfo<Cars> suppqueryAll(Integer pageNum, Integer pageSize,String goodname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		if(goodname == ""|| goodname == null) {
		carsMapper.selectByExample(null);
		}else {
		carsMapper.carsQueryAll("%"+goodname+"%");
		}
		 return page.toPageInfo();
	}
	
	public Car queryByCarsid(Integer carid){
		Car car = carMapper.selectByPrimaryKey(carid);  
		CarsExample ce = new CarsExample();  
		ce.createCriteria().andCaridEqualTo(carid);
		List<Cars> cars = carsMapper.selectByExample(ce); 
		car.setCars(cars);
		return car ; 
	}
	
	public int deletecars(Integer carsid) {
		return carsMapper.deleteByPrimaryKey(carsid);
	}
}
