package com.accp.mapper;

import com.accp.domain.Turnover;
import com.accp.domain.TurnoverExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}