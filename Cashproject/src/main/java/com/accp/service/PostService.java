package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Model;
import com.accp.domain.Post;
import com.accp.mapper.PostMapper;
import com.accp.mapper.PoweroneMapper;

@Service
@Transactional
public class PostService {
	@Autowired
	private PostMapper postMapper;
	@Autowired
	private PoweroneMapper poweroneMapper;
	
	public List<Post>querypost(){
		return postMapper.selectByExample(null);
	}
	/**
	 * 查询具体权限
	 * @return
	 */
	public List<Model> selectModelAll(){
		return poweroneMapper.selectModelAll();
	}
	
	public List<Model> selectpositionBypid(Integer id){
		return postMapper.selectpositionBypid(id);
	}
	
	public Post selectposition(int id){
		return postMapper.electposition(id);
	}
	/**
	 * 修改
	 * @param record
	 * @return
	 */
	public int updatepositionBypid(Post record) {
		return postMapper.updatepositionBypid(record);
	}

}
