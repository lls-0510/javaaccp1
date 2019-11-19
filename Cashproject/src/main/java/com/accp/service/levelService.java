package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Integral;
import com.accp.domain.Vtype;
import com.accp.mapper.IntegralMapper;
import com.accp.mapper.VtypeMapper;

@Service
@Transactional
public class levelService {

	@Autowired
	VtypeMapper vtypeMapper;  
	
	/**
	 * 查询所有等级
	 * @return
	 */
	public List<Vtype> queryAll(){
		return vtypeMapper.selectByExample(null);
	}
	
	/**
	 * 添加
	 * @param vtype
	 * @return
	 */
	public boolean addlevel(Vtype vtype) {
		vtypeMapper.insert(vtype);
		return true; 
	}
	/**
	 * 删除
	 * @param vid
	 * @return
	 */
	public boolean dellevel(String vid) {
		vtypeMapper.deleteByPrimaryKey(Integer.parseInt(vid));  
		return true;
	}
	/**
	 * 修改
	 * @param vtype
	 * @return
	 */
	public boolean updatelevel(Vtype vtype) {
		vtypeMapper.updateByPrimaryKey(vtype); 
		return true;
	}
	 
	/**
	 * 根据 vid查询  
	 * @param vid
	 * @return
	 */
	public Vtype queryByvid(String vid) {
		return vtypeMapper.selectByPrimaryKey(Integer.parseInt(vid));
	} 
	
	
	//  // // // // // // // 这里是积分设置  
	@Autowired  
	IntegralMapper integralMapper;  
	/**
	 * 查询积分
	 * @return
	 */
	public Integral queryIntegra() {
		return integralMapper.selectByPrimaryKey(1); 
	}
	
	public boolean updateIntegra(Integral integral) {
		integralMapper.updateByPrimaryKey(integral);
		return true;
	}
	
}
