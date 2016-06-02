package com.yew1eb.mapper;

import com.yew1eb.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/5/30
 * @description
 */

@Component
public interface UserMapper {

    String FIELDS = "uid,login_name,password,avatar,email,c_time,u_time,role_id,status";
    String TABLE = "t_user";

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " WHERE uid = #{id}")
    User getUserById(@Param("id") Long id);


    @Select("SELECT " + FIELDS + " FROM " + TABLE + " where login_name = #{loginName} and status = 1")
    User getUserByLoginName(@Param("loginName") String loginName);

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " LIMIT #{offset}, #{limit}")
    List<User> getAllUser(@Param("offset") Long offset,
                          @Param("limit") Long limit);
}
