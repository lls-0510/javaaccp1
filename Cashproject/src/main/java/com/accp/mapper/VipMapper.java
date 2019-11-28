package com.accp.mapper;

import com.accp.domain.Vip;
import com.accp.domain.VipCount;
import com.accp.domain.VipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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
    
    @Update("UPDATE\r\n" + 
    		"  vip\r\n" + 
    		"SET\r\n" + 
    		"  vtypeid = #{vtypeid},\r\n" + 
    		"  vname = #{vname},\r\n" + 
    		"  vphone = #{vphone},\r\n" + 
    		"  province = #{province},\r\n" + 
    		"  city= #{city},\r\n" + 
    		"  area = #{area},\r\n" + 
    		"  street = #{street},\r\n" + 
    		"  vpwd = #{vpwd}\r\n" + 
    		"where vid = #{vid}")
    int updatevip(Vip record);
    
    @Select("SELECT * FROM `vip`\r\n" + 
    		"LEFT JOIN vtype ON vip.`Vtypeid`=vtype.`VTid`\r\n" + 
    		"LEFT JOIN (\r\n" + 
    		" (SELECT turnover.`vid` AS id,COUNT(*) AS countsum,SUM(order_totalMoney)AS countprice,turnover.`order_date` FROM `turnover`\r\n" + 
    		"GROUP BY turnover.`vid`\r\n" + 
    		"ORDER BY turnover.`order_date`) AS ss\r\n" + 
    		") ON vip.`VID`=ss.id WHERE vip.`vname` LIKE #{vname}")
    List<VipCount>Vipcount(String vname);
    
<<<<<<< HEAD
    @Select("SELECT * FROM `vip`\r\n" + 
    		"LEFT JOIN vtype ON vip.`Vtypeid`=vtype.`VTid`\r\n" + 
    		"LEFT JOIN (\r\n" + 
    		" (SELECT turnover.`vid` AS id,COUNT(*) AS countsum,SUM(order_totalMoney)AS countprice,turnover.`order_date` FROM `turnover`\r\n" + 
    		"GROUP BY turnover.`vid`\r\n" + 
    		"ORDER BY turnover.`order_date`) AS ss\r\n" + 
    		") ON vip.`VID`=ss.id")
    List<VipCount>find();
=======
    @Select("SELECT v.*,(SELECT `VTname`  FROM vtype WHERE vtid = v.`Vtypeid`)AS vtname,(SELECT `VtDiscount`  FROM vtype WHERE vtid = v.`Vtypeid`)AS vt  FROM vip AS v ")
    List<Vip> queryAll();
>>>>>>> oxw
    
}