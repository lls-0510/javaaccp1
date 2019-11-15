package com.accp.mapper;

import com.accp.domain.Productlist;
import com.accp.domain.ProductlistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductlistMapper {
    int countByExample(ProductlistExample example);

    int deleteByExample(ProductlistExample example);

    int deleteByPrimaryKey(Integer prid);

    int insert(Productlist record);

    int insertSelective(Productlist record);

    List<Productlist> selectByExample(ProductlistExample example);

    Productlist selectByPrimaryKey(Integer prid);

    int updateByExampleSelective(@Param("record") Productlist record, @Param("example") ProductlistExample example);

    int updateByExample(@Param("record") Productlist record, @Param("example") ProductlistExample example);

    int updateByPrimaryKeySelective(Productlist record);

    int updateByPrimaryKey(Productlist record);
}