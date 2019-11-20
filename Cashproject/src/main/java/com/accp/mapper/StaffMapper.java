package com.accp.mapper;

import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(Integer staffid);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(Integer staffid);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKey(Staff record);
    
    @Select("SELECT * FROM staff a INNER JOIN store b ON a.`storeid`=b.`id` WHERE a.`staffName` LIKE #{staffName}")
    List<Staff>staffqueryAll(String staffname);
    
    @Select("SELECT * FROM staff a INNER JOIN store b ON a.`storeid`=b.`id` WHERE a.staffid=#{staffid}")
    Staff staffqueryById(Integer staffid);
   
    @Update("UPDATE staff SET staffname = #{staffname}, staffpwd = #{staffpwd}, staffphone = #{staffphone}, headportrait = #{headportrait},industry = #{industry},cardgo = #{cardgo} where staffid = #{staffid}")
    int updateStaff(@Param("staffname")String staffname,@Param("staffpwd")String staffpwd,@Param("staffphone")String staffphone,
    		@Param("headportrait")String headportrait,@Param("industry")String industry,@Param("cardgo")String cardgo,@Param("staffid")Integer staffid);
}