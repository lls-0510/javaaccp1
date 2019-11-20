package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Supplier;
import com.accp.mapper.SupplierMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class SupplierService {
	@Autowired
	private SupplierMapper supplierMapper;
	
	/**
	 * 供应商信息分页
	 * @return
	 */
	public PageInfo<Supplier> suppqueryAll(Integer pageNum, Integer pageSize,String Suname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		supplierMapper.suppqueryAll("%"+Suname+"%");
		 return page.toPageInfo();
	}
	/**
	 * 新增供应商
	 * @param record
	 * @return
	 */
	public int insertsupplier(Supplier record) {
		return supplierMapper.insert(record);
	}
	
	public Supplier suqueryById(Integer suid) {
		return supplierMapper.suqueryById(suid);
	}
	
	/**
	 * 删除供应商
	 * @param record
	 * @return
	 */
	public int deletesupplie(Integer suid) {
		return supplierMapper.deletesupplie(suid);
	}
	/**
	 * 查询供应商
	 * @return
	 */
	public List<Supplier> queryByName() {
		return supplierMapper.queryByName();
	}
	
	public int sudoupdate(String suname,String sucompany,String people,String phone,String email,String telephone,String province,String city,String area,Integer suid) {
		return supplierMapper.sudoupdate(suname, sucompany, people, phone, email, telephone, province, city, area, suid);
	}
	 
	
	

}
