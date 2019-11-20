package com.accp.mapper;

import com.accp.domain.Vip;
import com.accp.domain.VipCount;
import com.accp.domain.VipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface VipMapper {
    int countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(Integer vid);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(Integer vid);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);
    
    @Select("SELECT * FROM `vip`\r\n" + 
    		"LEFT JOIN vtype ON vip.`Vtypeid`=vtype.`VTid`\r\n" + 
    		"LEFT JOIN (\r\n" + 
    		" (SELECT turnover.`vid` AS id,COUNT(*) AS countsum,SUM(order_totalMoney)AS countprice,turnover.`order_date` FROM `turnover`\r\n" + 
    		"GROUP BY turnover.`vid`\r\n" + 
    		"ORDER BY turnover.`order_date`) AS ss\r\n" + 
    		") ON vip.`VID`=ss.id WHERE vip.`vname` LIKE #{vname}")
    List<VipCount>Vipcount(String vname);
    
}