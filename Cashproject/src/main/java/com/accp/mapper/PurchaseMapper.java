package com.accp.mapper;

import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseMapper {
    int countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer purid);
 
    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer purid);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);

    @Select("SELECT CASE WHEN COUNT(*)>99 THEN COUNT(*)+1 WHEN COUNT(*)>9 THEN CONCAT('0',COUNT(*)+1) ELSE CONCAT('00',COUNT(*)+1) END\n" +
            " FROM `purchase` WHERE `purdata`=#{deliverytime}")
    String findMax(String deliverytime);


}