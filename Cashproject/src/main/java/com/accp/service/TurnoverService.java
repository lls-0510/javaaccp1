package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.TurnoverCount;
import com.accp.mapper.TurnoverMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class TurnoverService {
	@Autowired
	private TurnoverMapper turnoverMapper;
	
	/**
	 * 成交记录分页
	 * @param pageNum
	 * @param pageSize
	 * @param ordername
	 * @return
	 */
	public PageInfo<TurnoverCount>queryTurnover(Integer pageNum,Integer pageSize,String ordername){
		Page page=PageHelper.startPage(pageNum, pageSize);
		turnoverMapper.queryTurnover("%"+ordername+"%");
		return page.toPageInfo();
	}
	/**
	 * 查询成交总数量
	 * @return
	 */
	public  List<TurnoverCount>queryNum(){
		return turnoverMapper.queryNum();
	}
	/**
	 * 查询总金额
	 * @return
	 */
	public List<TurnoverCount>queryprice(){
		return turnoverMapper.queryprice();
	}

}
