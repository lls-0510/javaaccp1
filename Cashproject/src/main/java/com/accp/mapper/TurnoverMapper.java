package com.accp.mapper;

import com.accp.domain.Turnover;
import com.accp.domain.TurnoverCount;
import com.accp.domain.TurnoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface TurnoverMapper {
    int countByExample(TurnoverExample example);

    int deleteByExample(TurnoverExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Turnover record);

    int insertSelective(Turnover record);

    List<Turnover> selectByExample(TurnoverExample example);

    Turnover selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Turnover record, @Param("example") TurnoverExample example);

    int updateByExample(@Param("record") Turnover record, @Param("example") TurnoverExample example);

    int updateByPrimaryKeySelective(Turnover record);

    int updateByPrimaryKey(Turnover record);
    
    @Select("select * from turnover a inner join turnoverdetails b on a.order_id =b.order_id where a.ordername like #{ordername}")
    List<TurnoverCount>queryTurnover(String ordername);
    
    @Select("SELECT COUNT(*) AS tusum FROM turnover a INNER JOIN turnoverdetails b ON a.order_id =b.order_id")
    List<TurnoverCount>queryNum();
    
    @Select("SELECT SUM(b.`goods_price`) AS tuPrice FROM turnover a INNER JOIN turnoverdetails b ON a.order_id =b.order_id")
    List<TurnoverCount>queryprice();
}