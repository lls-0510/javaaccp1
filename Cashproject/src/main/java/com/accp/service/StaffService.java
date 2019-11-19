package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Staff;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class StaffService {
	
	@Autowired
	private StaffMapper mapper;
	
	public Staff queryByName(String name) {
		return mapper.queryByName(name);
	}
}
