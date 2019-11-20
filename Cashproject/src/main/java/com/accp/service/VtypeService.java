package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Vtype;
import com.accp.mapper.VtypeMapper;

@Service
@Transactional
public class VtypeService {
	@Autowired
	private VtypeMapper vtypemapper;
	
	public List<Vtype> queryAll(){
		return vtypemapper.selectByExample(null);
	}
	

}
