package com.accp.mapper;

import com.accp.domain.Integral;
import com.accp.domain.IntegralExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralMapper {
    int countByExample(IntegralExample example);

    int deleteByExample(IntegralExample example);

    int deleteByPrimaryKey(Integer intid);

    int insert(Integral record);

    int insertSelective(Integral record);

    List<Integral> selectByExample(IntegralExample example);

    Integral selectByPrimaryKey(Integer intid);

    int updateByExampleSelective(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByExample(@Param("record") Integral record, @Param("example") IntegralExample example);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}