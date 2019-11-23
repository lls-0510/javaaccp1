package com.accp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.accp.domain.Statistics;

public interface StatisticsMapper {
	//统计成交量
	@Select("SELECT DATE_FORMAT(o.order_date,'%Y-%m-%d') AS dd,COUNT(*) AS cc FROM\r\n" + 
			"`turnover` o INNER JOIN `turnoverdetails` d ON o.order_id=d.order_id\r\n" + 
			"WHERE DATE_FORMAT(o.`order_date`,'%Y-%m-%d') >=#{begintime}\r\n" + 
			"AND DATE_FORMAT(o.`order_date`,'%Y-%m-%d') <=#{endtime}\r\n" + 
			"GROUP BY DATE_FORMAT(o.`order_date`,'%Y-%m-%d')")
	public List<Statistics>queryAllStatistic(@Param("begintime")String begintime,@Param("endtime")String endtime);

}
