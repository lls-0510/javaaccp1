package com.accp.mapper;

import com.accp.domain.Productinfo;
import com.accp.domain.ProductinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductinfoMapper {
    int countByExample(ProductinfoExample example);

    int deleteByExample(ProductinfoExample example);

    int deleteByPrimaryKey(Integer proid);

    int insert(Productinfo record);

    int insertSelective(Productinfo record);

    List<Productinfo> selectByExample(ProductinfoExample example);

    Productinfo selectByPrimaryKey(Integer proid);

    int updateByExampleSelective(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    int updateByExample(@Param("record") Productinfo record, @Param("example") ProductinfoExample example);

    int updateByPrimaryKeySelective(Productinfo record);

    int updateByPrimaryKey(Productinfo record);
}