package com.accp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Car;
import com.accp.service.CarService;

@Controller
public class CarController {
	
	@Autowired
	private CarService carService;
	
	@RequestMapping("/insertCarOxw")
	@ResponseBody
	public int insertCar(@RequestBody Car c) {
		return carService.insertcar(c);
	}
}
