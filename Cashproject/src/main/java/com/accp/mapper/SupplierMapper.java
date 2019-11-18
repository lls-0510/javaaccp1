package com.accp.mapper;

import com.accp.domain.Supplier;
import com.accp.domain.SupplierExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SupplierMapper {
    int countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(Integer suid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    Supplier selectByPrimaryKey(Integer suid);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
    
    @Select("SELECT * FROM `supplier` WHERE Suname LIKE #{Suname}")
    List<Supplier> suppqueryAll(String Suname);
    @Delete("DELETE from supplier where suid=#{suid}")
    int deletesupplie(Integer suid);
    @Select("SELECT  * FROM `supplier`")
    List<Supplier> queryByName();
    
    @Select("SELECT  * FROM `supplier` where suid=#{suid}")
    Supplier suqueryById(Integer suid);
    
    @Update("UPDATE `project`.`supplier` SET`suname` =#{suname}, `sucompany` =#{sucompany}, `people` =#{people},`phone` =#{phone} , `email` = #{email}, `telephone` =#{telephone} , `province` =#{province} ,`city` =#{city}, `area` = #{area} WHERE `suid` = #{suid}")
    int sudoupdate(@Param("suname")String suname,@Param("sucompany")String sucompany,@Param("people")String people,@Param("phone")String phone,@Param("email")String email,@Param("telephone")String telephone,@Param("province")String province,@Param("city")String city,@Param("area")String area,@Param("suid")Integer suid);
}