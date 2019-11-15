package com.accp.mapper;

import com.accp.domain.Saletype;
import com.accp.domain.SaletypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SaletypeMapper {
    int countByExample(SaletypeExample example);

    int deleteByExample(SaletypeExample example);

    int deleteByPrimaryKey(Integer saleid);

    int insert(Saletype record);

    int insertSelective(Saletype record);

    List<Saletype> selectByExample(SaletypeExample example);

    Saletype selectByPrimaryKey(Integer saleid);

    int updateByExampleSelective(@Param("record") Saletype record, @Param("example") SaletypeExample example);

    int updateByExample(@Param("record") Saletype record, @Param("example") SaletypeExample example);

    int updateByPrimaryKeySelective(Saletype record);

    int updateByPrimaryKey(Saletype record);
}