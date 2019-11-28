package com.accp.mapper;

import com.accp.domain.Model;
import com.accp.domain.User;
import com.accp.domain.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    @Select("SELECT * FROM `user` WHERE Username =#{username} AND Userpwd =#{userpwd}")
    User Login(User record);
    
    @Update("UPDATE user set username = #{username},userpwd = #{userpwd},userphone = #{userphone} where userid = #{userid}")
    int updateUser(User u);
    
    @Select("  SELECT p.*,m.*\r\n" + 
    		"	FROM nexus mp,powerone m,post p,staff s\r\n" + 
    		"	WHERE  mp.`zid`=m.`Jid` AND  p.id=mp.jid  AND s.`postid`=p.`id`\r\n" + 
    		"	AND s.staffName=#{staffname}")
    List<Model> selectShopAllByjobnumber(String staffname);
}