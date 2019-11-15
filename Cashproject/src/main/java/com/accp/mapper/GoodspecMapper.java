package com.accp.mapper;

import com.accp.domain.Goodspec;
import com.accp.domain.GoodspecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodspecMapper {
    int countByExample(GoodspecExample example);

    int deleteByExample(GoodspecExample example);

    int deleteByPrimaryKey(Integer gid);

    int insert(Goodspec record);

    int insertSelective(Goodspec record);

    List<Goodspec> selectByExample(GoodspecExample example);

    Goodspec selectByPrimaryKey(Integer gid);

    int updateByExampleSelective(@Param("record") Goodspec record, @Param("example") GoodspecExample example);

    int updateByExample(@Param("record") Goodspec record, @Param("example") GoodspecExample example);

    int updateByPrimaryKeySelective(Goodspec record);

    int updateByPrimaryKey(Goodspec record);
}