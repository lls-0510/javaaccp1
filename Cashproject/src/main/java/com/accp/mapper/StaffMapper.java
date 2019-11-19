package com.accp.mapper;

import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
    
<<<<<<< HEAD
    @Select("SELECT * FROM staff a INNER JOIN store b ON a.`storeid`=b.`id` WHERE a.`staffName` LIKE #{staffName}")
    List<Staff>staffqueryAll(String staffname);
=======
    @Select("select * from staff where staffname = #{name}")
    Staff queryByName(String name);
>>>>>>> oxw
}