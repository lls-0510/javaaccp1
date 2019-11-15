package com.accp.mapper;

import com.accp.domain.Storetype;
import com.accp.domain.StoretypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoretypeMapper {
    int countByExample(StoretypeExample example);

    int deleteByExample(StoretypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Storetype record);

    int insertSelective(Storetype record);

    List<Storetype> selectByExample(StoretypeExample example);

    Storetype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Storetype record, @Param("example") StoretypeExample example);

    int updateByExample(@Param("record") Storetype record, @Param("example") StoretypeExample example);

    int updateByPrimaryKeySelective(Storetype record);

    int updateByPrimaryKey(Storetype record);
}