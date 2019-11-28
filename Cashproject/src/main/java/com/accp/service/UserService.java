package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Model;
import com.accp.domain.User;
import com.accp.mapper.UserMapper;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public User login(User record) {
		return mapper.Login(record);
	} 
	
	public List<Model> selectShopAllByjobnumber(String staffname){
		System.out.println(mapper.selectShopAllByjobnumber(staffname).toString()+"666666");
		return mapper.selectShopAllByjobnumber(staffname);
	}
}
