package com.accp.mapper;

import com.accp.domain.Good;
import com.accp.domain.GoodExample;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Service;

public interface GoodMapper {
    int countByExample(GoodExample example);

    int deleteByExample(GoodExample examples);

    int deleteGoodType(Integer goodid);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(Integer goodid);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);
    
    @Insert("insert into good(Goodname)value(#{Goodname})")
    int addGoodType(String Goodname);
    
    @Delete("delete from good where goodid=#{goodid}")
    int delGoodType(Integer goodid);
    
    @Update("update good set Goodname=#{Goodname} where goodid=#{goodid}")
    int updateGoodType(@Param("Goodname")String Goodname,@Param("goodid")Integer goodid);
    
}