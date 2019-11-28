package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Car;
import com.accp.domain.Cars;
import com.accp.domain.Purchase;
import com.accp.mapper.CarMapper;
import com.accp.mapper.CarsMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class CarService {
	
	@Autowired
	private CarMapper carMapper;
	
	@Autowired
	private CarsMapper carsMapper;
	
	
	public int insertcar(Car c) {
		if(carMapper.selectByPrimaryKey(c.getCarid()) != null) {
			carMapper.updateByPrimaryKey(c);
			for (Cars cs : c.getCars()) {
				System.out.println(carsMapper.selectByPrimaryKey(cs.getCarsid())+"999999999999999999999999999");
				if(carsMapper.selectByPrimaryKey(cs.getCarsid()) !=null) {
					cs.setCarid(c.getCarid());
					carsMapper.updateByPrimaryKey(cs);
				}else {
					cs.setCarid(c.getCarid());
					carsMapper.insert(cs);
				}
			}
		}else{
			carMapper.insert(c);
			for (Cars cs : c.getCars()) {
				cs.setCarid(c.getCarid());
				carsMapper.insert(cs);
			}
		}
		return 1111;
	}
	
}
