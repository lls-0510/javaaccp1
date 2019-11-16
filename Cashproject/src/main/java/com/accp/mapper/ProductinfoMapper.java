package com.accp.mapper;

import com.accp.domain.Productinfo;
import com.accp.domain.ProductinfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    
    @Select("SELECT * FROM `productinfo` a INNER JOIN `productlist` b ON a.`proid`=b.`proid` INNER JOIN `good` c ON b.`goodid`=c.`Goodid`")
    List<Productinfo>queryAll();
    
    @Delete("delete from productinfo where proid =#{proid}")
    int deleteproducinfo(Integer proid);
    
    @Select("SELECT * FROM `productinfo` a INNER JOIN `productlist` b ON a.`proid`=b.`proid` INNER JOIN `good` c ON b.`goodid`=c.`Goodid` WHERE a.`proid`=#{proid}")
    Productinfo queryById(Integer proid);
}