package com.accp.mapper;

import com.accp.domain.Powertwo;
import com.accp.domain.PowertwoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PowertwoMapper {
    int countByExample(PowertwoExample example);

    int deleteByExample(PowertwoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Powertwo record);

    int insertSelective(Powertwo record);

    List<Powertwo> selectByExample(PowertwoExample example);

    Powertwo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Powertwo record, @Param("example") PowertwoExample example);

    int updateByExample(@Param("record") Powertwo record, @Param("example") PowertwoExample example);

    int updateByPrimaryKeySelective(Powertwo record);

    int updateByPrimaryKey(Powertwo record);
}