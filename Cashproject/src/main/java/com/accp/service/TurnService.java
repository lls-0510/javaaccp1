package com.accp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.domain.Turnover;
import com.accp.domain.Turnoverdetails;
import com.accp.mapper.TurnoverMapper;
import com.accp.mapper.TurnoverdetailsMapper;

@Service
public class TurnService {
	
	@Autowired
	private TurnoverMapper turnoverMapper;
	
	@Autowired
	private TurnoverdetailsMapper turnoverdetailsMapper;
	
	public int insertTurn(Turnover t) {
		turnoverMapper.insert(t);
		for (Turnoverdetails ts : t.getTurns()) {
			ts.setOrderId(t.getOrderId().toString());
			turnoverdetailsMapper.insert(ts);
		}
		return 111;
	}
}
