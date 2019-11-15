package com.accp.mapper;

import com.accp.domain.Goodsdetail;
import com.accp.domain.GoodsdetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsdetailMapper {
    int countByExample(GoodsdetailExample example);

    int deleteByExample(GoodsdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goodsdetail record);

    int insertSelective(Goodsdetail record);

    List<Goodsdetail> selectByExample(GoodsdetailExample example);

    Goodsdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Goodsdetail record, @Param("example") GoodsdetailExample example);

    int updateByExample(@Param("record") Goodsdetail record, @Param("example") GoodsdetailExample example);

    int updateByPrimaryKeySelective(Goodsdetail record);

    int updateByPrimaryKey(Goodsdetail record);
}