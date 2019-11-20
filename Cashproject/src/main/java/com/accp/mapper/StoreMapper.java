package com.accp.mapper;

import com.accp.domain.Store;
import com.accp.domain.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StoreMapper {
    int countByExample(StoreExample example);

    int deleteByExample(StoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Store record);

    int insertSelective(Store record);

    List<Store> selectByExample(StoreExample example);

    Store selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByExample(@Param("record") Store record, @Param("example") StoreExample example);

    int updateByPrimaryKeySelective(Store record);

    int updateByPrimaryKey(Store record);
    
    @Select("SELECT s.*, ( SELECT COUNT(*) FROM staff AS r WHERE r.storeid=s.id GROUP BY r. storeid)AS staffcount FROM store AS s")
    List<Store>storequeryAll();
    
    @Update("UPDATE store SET people =#{people}, phone = #{phone},telephone = #{telephone},starTime = #{starTime},endTime = #{endTime},province = #{province},city = #{city},area= #{area},ditem = #{ditem},storename = #{storename},card = #{card}, remark =#{remark},jcname = #{jcname} where id = #{id}")
    int updatestore(@Param("people")String people,@Param("phone")String phone,@Param("telephone")String telephone,@Param("starTime")String starTime,
			@Param("endTime")String endTime,@Param("province")String province,@Param("city")String city,@Param("area")String area,@Param("ditem")String ditem,
			@Param("storename")String storename,@Param("card")String card,@Param("remark")String remark,@Param("jcname")String jcname,@Param("id")Integer id);
}