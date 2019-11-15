package com.accp.mapper;

import com.accp.domain.Turnoverdetails;
import com.accp.domain.TurnoverdetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TurnoverdetailsMapper {
    int countByExample(TurnoverdetailsExample example);

    int deleteByExample(TurnoverdetailsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Turnoverdetails record);

    int insertSelective(Turnoverdetails record);

    List<Turnoverdetails> selectByExample(TurnoverdetailsExample example);

    Turnoverdetails selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Turnoverdetails record, @Param("example") TurnoverdetailsExample example);

    int updateByExample(@Param("record") Turnoverdetails record, @Param("example") TurnoverdetailsExample example);

    int updateByPrimaryKeySelective(Turnoverdetails record);

    int updateByPrimaryKey(Turnoverdetails record);
}