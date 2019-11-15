package com.accp.mapper;

import com.accp.domain.Powerone;
import com.accp.domain.PoweroneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoweroneMapper {
    int countByExample(PoweroneExample example);

    int deleteByExample(PoweroneExample example);

    int deleteByPrimaryKey(Integer jid);

    int insert(Powerone record);

    int insertSelective(Powerone record);

    List<Powerone> selectByExample(PoweroneExample example);

    Powerone selectByPrimaryKey(Integer jid);

    int updateByExampleSelective(@Param("record") Powerone record, @Param("example") PoweroneExample example);

    int updateByExample(@Param("record") Powerone record, @Param("example") PoweroneExample example);

    int updateByPrimaryKeySelective(Powerone record);

    int updateByPrimaryKey(Powerone record);
}