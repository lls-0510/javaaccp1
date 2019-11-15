package com.accp.mapper;

import com.accp.domain.Nexus;
import com.accp.domain.NexusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NexusMapper {
    int countByExample(NexusExample example);

    int deleteByExample(NexusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Nexus record);

    int insertSelective(Nexus record);

    List<Nexus> selectByExample(NexusExample example);

    Nexus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Nexus record, @Param("example") NexusExample example);

    int updateByExample(@Param("record") Nexus record, @Param("example") NexusExample example);

    int updateByPrimaryKeySelective(Nexus record);

    int updateByPrimaryKey(Nexus record);
}