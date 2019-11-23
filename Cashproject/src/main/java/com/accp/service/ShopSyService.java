package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Shop;
import com.accp.mapper.ShopMapper;

@Service
@Transactional
public class ShopSyService {

	@Autowired
	private ShopMapper shopMapper;
	
	public List<Shop> queryAll(){
		return shopMapper.selectByExample(null);
	}
	
	public Shop queryById(Integer sid) {
		return shopMapper.selectByPrimaryKey(sid);
	}
}
