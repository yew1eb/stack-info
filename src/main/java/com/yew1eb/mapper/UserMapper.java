package com.yew1eb.mapper;

import com.yew1eb.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/5/30
 * @description
 */
public interface UserMapper {

    @Select("select id, name, age, password from user where id = #{id}")
    User findUserById(@Param("id") int id);

    @Select("select id, name, age, password from user")
    List<User> getAllUser();
}
