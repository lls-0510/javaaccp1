package com.accp.mapper;

import com.accp.domain.Store;
import com.accp.domain.StoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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
}