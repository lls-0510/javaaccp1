package com.accp.mapper;

import com.accp.domain.Pruchasedetails;
import com.accp.domain.PruchasedetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PruchasedetailsMapper {
    int countByExample(PruchasedetailsExample example);

    int deleteByExample(PruchasedetailsExample example);

    int deleteByPrimaryKey(Integer prdid);

    int insert(Pruchasedetails record);

    int insertSelective(Pruchasedetails record);

    List<Pruchasedetails> selectByExample(PruchasedetailsExample example);

    Pruchasedetails selectByPrimaryKey(Integer prdid);

    int updateByExampleSelective(@Param("record") Pruchasedetails record, @Param("example") PruchasedetailsExample example);

    int updateByExample(@Param("record") Pruchasedetails record, @Param("example") PruchasedetailsExample example);

    int updateByPrimaryKeySelective(Pruchasedetails record);

    int updateByPrimaryKey(Pruchasedetails record);
}