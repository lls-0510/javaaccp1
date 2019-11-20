package com.accp.mapper;

import com.accp.domain.Shopdetails;
import com.accp.domain.ShopdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopdetailsMapper {
    int countByExample(ShopdetailsExample example);

    int deleteByExample(ShopdetailsExample example);

    int deleteByPrimaryKey(Integer sdid);

    int insert(Shopdetails record);

    int insertSelective(Shopdetails record);

    List<Shopdetails> selectByExample(ShopdetailsExample example);

    Shopdetails selectByPrimaryKey(Integer sdid);

    int updateByExampleSelective(@Param("record") Shopdetails record, @Param("example") ShopdetailsExample example);

    int updateByExample(@Param("record") Shopdetails record, @Param("example") ShopdetailsExample example);

    int updateByPrimaryKeySelective(Shopdetails record);

    int updateByPrimaryKey(Shopdetails record);
}