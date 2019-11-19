package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Post;
import com.accp.mapper.PostMapper;

@Service
@Transactional
public class PostService {
	@Autowired
	private PostMapper postMapper;
	
	public List<Post>querypost(){
		return postMapper.selectByExample(null);
	}

}
