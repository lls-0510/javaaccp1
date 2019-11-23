package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Supplier;
import com.accp.domain.Vip;
import com.accp.domain.VipCount;
import com.accp.domain.VipExample;
import com.accp.mapper.VipMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class VipService {
	@Autowired
	private VipMapper vipMapper;
	/**
	 * 查询会员信息分页
	 * @return
	 */
	public PageInfo<VipCount> Vipcount(Integer pageNum, Integer pageSize,String vname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		vipMapper.Vipcount("%"+vname+"%");
		 return page.toPageInfo();
	}
	
	public int insertvip(Vip record) {
		return vipMapper.insert(record);
	}
	
	public Vip queryVipid(Integer vid) {
		return vipMapper.selectByPrimaryKey(vid);
	}
	
	public int updatetvip(Vip record) {
		return vipMapper.updatevip(record);
	}
	
	public int deleteVip(Integer vid) {
		return vipMapper.deleteByPrimaryKey(vid);
	}
	
	public List<VipCount>find(String vname){
		System.out.println(vname);
		return vipMapper.Vipcount("%"+vname+"%");
	}
	
	

}
