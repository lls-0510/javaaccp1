package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Good;
import com.accp.domain.Shop;
import com.accp.domain.Vip;
import com.accp.mapper.GoodMapper;
import com.accp.mapper.ShopMapper;
import com.accp.mapper.VipMapper;

@Service
@Transactional
public class ShopSyService {

	@Autowired
	private ShopMapper shopMapper;
	
	@Autowired
	private VipMapper vipMapper;
	
	@Autowired
	private GoodMapper goodMapper;
	
	public List<Good> queryGood(){
		return goodMapper.selectByExample(null);
	}
	
	public List<Shop> queryAll(){
		return shopMapper.selectByExample(null);
	}
	
	public List<Shop> queryByGoodid(Integer goodid){
		return shopMapper.queryByGoodid(goodid);
	}
	
	public List<Shop> queryBySname(String sname){
		return shopMapper.queryBySname(sname);
	}
	
	public Shop queryById(Integer sid) {
		return shopMapper.selectByPrimaryKey(sid);
	}
	
	public List<Vip> queryAllVip() {
		return vipMapper.queryAll();
	}
}
