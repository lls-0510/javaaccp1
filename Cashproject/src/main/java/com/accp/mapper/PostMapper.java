package com.accp.mapper;

import com.accp.domain.Model;
import com.accp.domain.Post;
import com.accp.domain.PostExample;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PostMapper {
    int countByExample(PostExample example);

    int deleteByExample(PostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Post record);

    int insertSelective(Post record);

    List<Post> selectByExample(PostExample example);
    @Select("select * from post")
    List<Post> queryAll();

    Post selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKey(Post record);
    
    @Insert("insert into post(type)values(#{type})")
    int insertpost(String type);
    @Select("select * from post where type=#{type}")
    Post selectpositionBytype(String type);
    
    @Select("SELECT * FROM `nexus` mp,`powerone` m,`post` p\r\n" + 
    		"	WHERE mp.`zid`=m.`Jid` AND p.id=mp.jid \r\n" + 
    		"	AND p.id=#{id}")
    List<Model> selectpositionBypid(Integer id);

    
    @Select("select * from post where id=#{id}")
    Post electposition(int id);
    
    @Update("update post set type=#{type} where id=#{id}")
    int updatepositionBypid(Post record);
}