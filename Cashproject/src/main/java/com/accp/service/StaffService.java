package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Staff;
import com.accp.domain.User;
import com.accp.mapper.StaffMapper;
import com.accp.mapper.UserMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class StaffService {
	@Autowired
	private StaffMapper staffMapper;
	@Autowired
	private UserMapper mapper;
	
	/**
	 * 店铺信息分页
	 * @return
	 */
	public PageInfo<Staff> staffqueryAll(Integer pageNum, Integer pageSize,String staffname){
		Page page = PageHelper.startPage(pageNum, pageSize);
		staffMapper.staffqueryAll("%"+staffname+"%");
		 return page.toPageInfo();
	}
	
	public int update(Staff sf,Integer userid) {
		 staffMapper.update(sf);
		 User u = new User();
		 u.setUserid(userid);
		 u.setUsername(sf.getStaffname());
		 u.setUserphone(sf.getStaffphone());
		 u.setUserpwd(sf.getStaffpwd());
		 mapper.updateUser(u);
		 return 1;	 
	}

		
	public Staff queryByName(String name) {
		return staffMapper.queryByName(name);
	}
	
	public int updateHead(String staffid,String headPortrait) {
		return staffMapper.updateHead(staffid, headPortrait);
	}

}
