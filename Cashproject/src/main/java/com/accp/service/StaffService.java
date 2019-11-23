
package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Staff;
import com.accp.domain.StaffCount;
import com.accp.mapper.StaffMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service  
@Transactional
public class StaffService {
	@Autowired
	private StaffMapper staffMapper;
	
	/**
	 * 店铺信息分页
	 * @return
	 */
	public PageInfo<StaffCount> staffqueryAll(Integer pageNum, Integer pageSize,String staffname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		staffMapper.staffqueryAll("%"+staffname+"%");
		 return page.toPageInfo();
	}
	


		
	public Staff queryByName(String name) {
		return staffMapper.queryByName(name);
	}

	public  Staff staffqueryById(Integer staffid){
		return staffMapper.staffqueryById(staffid);
	}
	
	public int updateStaff(String staffname,String staffpwd,String staffphone,
	String headportrait,String industry,
	String cardgo,Integer staffid) {
		return staffMapper.updateStaff(staffname, staffpwd, staffphone, headportrait, industry, cardgo, staffid);
	}
	
	public int insertStaff(Staff record) {
		return staffMapper.insert(record);
	}
	
	public int deleteStaff(Integer staffid) {
		return staffMapper.deleteByPrimaryKey(staffid);
	}
	 

}

