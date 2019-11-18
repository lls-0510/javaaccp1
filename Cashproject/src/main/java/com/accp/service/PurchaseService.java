package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Purchase;
import com.accp.domain.Supplier;
import com.accp.mapper.PurchaseMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class PurchaseService {
	@Autowired
	private PurchaseMapper purchaseMapper;
	/**
	 * 查询采购单信息
	 * @param suname
	 * @return
	 */
	public PageInfo<Purchase> purchasequeryAll(Integer pageNum, Integer pageSize,String suname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		purchaseMapper.purchasequeryAll("%"+suname+"%");
		 return page.toPageInfo();
	}
	

	/**
	 * 创建流水号
	 * @param deliverytime
	 * @return
	 */
	public String findMax(String deliverytime) {
		return purchaseMapper.findMax(deliverytime);
	}
	
	/**
	 * 删除
	 * @param purchaseid
	 * @return
	 */
	public int deletePushase(Integer purchaseid) {
		return purchaseMapper.deletePushase(purchaseid);
	}
	
	public List<Purchase> purchasequeryAllById(Integer purchaseid) {
		return purchaseMapper.purchasequeryAllById(purchaseid);
	}

}
