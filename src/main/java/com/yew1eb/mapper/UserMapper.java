package com.yew1eb.mapper;

import com.yew1eb.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhouhai
 * @createTime 16/5/30
 * @description
 */
public interface UserMapper {


    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    void create(@Param("name") String name,
                       @Param("age") Integer age);

    @Delete("DELETE FROM user WHERE name =#{name}")
    void deleteByName(@Param("name") String name);

    @Select("SELECT COUNT(1) FROM user")
    Integer getAllUsers();
}
