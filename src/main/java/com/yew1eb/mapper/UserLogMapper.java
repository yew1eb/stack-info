package com.yew1eb.mapper;

import com.yew1eb.model.UserLog;
import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Component;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */

@Component
public interface UserLogMapper {
    String FIELDS = "id, uid, action, content, ip, c_time";
    String TABLE = "t_userlog";

    @Insert("INSERT INTO " + TABLE + "(" + FIELDS + ") " +
            "VALUES( null, #{uid}, #{action}, #{content}, #{ip}, #{cTime}")
    void insert(UserLog userLog);
}
