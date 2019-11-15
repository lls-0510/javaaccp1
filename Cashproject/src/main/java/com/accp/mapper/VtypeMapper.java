package com.accp.mapper;

import com.accp.domain.Vtype;
import com.accp.domain.VtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VtypeMapper {
    int countByExample(VtypeExample example);

    int deleteByExample(VtypeExample example);

    int deleteByPrimaryKey(Integer vtid);

    int insert(Vtype record);

    int insertSelective(Vtype record);

    List<Vtype> selectByExample(VtypeExample example);

    Vtype selectByPrimaryKey(Integer vtid);

    int updateByExampleSelective(@Param("record") Vtype record, @Param("example") VtypeExample example);

    int updateByExample(@Param("record") Vtype record, @Param("example") VtypeExample example);

    int updateByPrimaryKeySelective(Vtype record);

    int updateByPrimaryKey(Vtype record);
}