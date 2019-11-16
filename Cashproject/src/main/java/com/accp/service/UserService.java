package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.mapper.UserMapper;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserMapper mapper;
	
	public int login(String username,String userpwd) {
		return mapper.Login(username, userpwd);
	}
}
