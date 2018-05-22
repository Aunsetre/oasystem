package com.aunsetre.mapping;

import com.aunsetre.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface UserMapper {
    @Select("select * from USER where name=#{name} and pwd=#{pwd}")
public User login(@Param("name") String name,@Param("pwd") String pwd);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);
@Select("select * from user")
    List<User> selectAll();

    int updateByPrimaryKey(User record);
}