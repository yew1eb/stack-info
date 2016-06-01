package com.yew1eb.mapper;

import com.yew1eb.model.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */

@Component
public interface UserInfoMapper {
    String FIELDS = "uid,nick_name,jobs,web_site,github,weibo,location,signature,instructions";
    String TABLE = "t_userinfo";

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " WHERE uid=#{uid}")
    UserInfo getUserInfo(@Param("uid") Long uid);
}
