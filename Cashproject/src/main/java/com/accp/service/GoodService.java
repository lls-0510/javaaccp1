package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Good;
import com.accp.mapper.GoodMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class GoodService {
	@Autowired
	private GoodMapper goodMapper;

	/*
	 * @Autowired private ProductinfoMapper productinfoMapper;
	 */
	/**

	@Autowired
/*	private ProductinfoMapper productinfoMapper;
*/	/**

	 * 查询商品类型
	 * @return
	 */
	public List<Good>queryAll(){
		return goodMapper.selectByExample(null);
	}
	
	/**
	 * 新增商品类型
	 * @param goodname
	 * @return
	 */
	public int addGoodType(String goodname) {
		return goodMapper.addGoodType(goodname);
		
	}

	/**
	 * 删除商品类型
	 * @param goodname
	 * @return
	 */
	public int deleteGoodType(Integer goodid) {
		return goodMapper.delGoodType(goodid);
	}
	
	public int updateGoodType(String Goodname,Integer goodid) {
		return goodMapper.updateGoodType(Goodname,goodid);
	}
	
	public Good queryById(Integer goodid) {
		return goodMapper.selectByPrimaryKey(goodid);
	}
	
	/**
	 * 商品信息分页
	 * @return
	 */

	
	/**
	 * 删除商品信息
	 * @param proid
	 * @return
	 */

	
	/**
	 * 查询商品信息id
	 * @param proid
	 * @return
	 */

	
	/**
	 * 查询
	 * @param proid
	 * @return
	 */


}
