package com.accp.mapper;

import com.accp.domain.Purchase;
import com.accp.domain.PurchaseExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PurchaseMapper {
    int countByExample(PurchaseExample example);

    int deleteByExample(PurchaseExample example);

    int deleteByPrimaryKey(Integer purchaseid);

    int insert(Purchase record);

    int insertSelective(Purchase record);

    List<Purchase> selectByExample(PurchaseExample example);

    Purchase selectByPrimaryKey(Integer purchaseid);

    int updateByExampleSelective(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByExample(@Param("record") Purchase record, @Param("example") PurchaseExample example);

    int updateByPrimaryKeySelective(Purchase record);

    int updateByPrimaryKey(Purchase record);
    //查询采购信息
    @Select("select * from `purchasedetails` a inner join `purchase` b on a.`purchaseid`=b.`purchaseid` inner join `supplier` c on b.`SuId`=c.`SuId` where c.`suname` like #{suname}")
    List<Purchase>purchasequeryAll(String suname);
    
    @Select("SELECT CASE WHEN COUNT(*)>99 THEN COUNT(*)+1 WHEN COUNT(*)>9 THEN CONCAT('0',COUNT(*)+1) ELSE CONCAT('00',COUNT(*)+1) END FROM `purchase` WHERE deliverytime=#{deliverytime}")
    String findMax(String deliverytime);
    
    @Delete("delete from purchase where purchaseid=#{purchaseid}")
    int deletePushase(Integer purchaseid);
    
    @Select("select * from `purchasedetails` a inner join `purchase` b on a.`purchaseid`=b.`purchaseid` inner join `supplier` c on b.`suid`=c.`suid` where a.purchaseid=#{purchaseid}")
    List<Purchase> purchasequeryAllById(Integer purchaseid);
    
        
}