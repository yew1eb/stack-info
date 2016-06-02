package com.yew1eb.mapper;

import com.yew1eb.model.ActiveCode;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
@Component
public interface ActiveCodeMapper {
    String FIELDS = "id,uid,code,type,is_use,e_time,c_time";
    String TABLE = "t_activecode";

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " WHERE code = #{code}")
    ActiveCode getActiveCode(@Param("code") String code);

    @Insert("INSERT INTO " + TABLE + "(uid, code, type, e_time, c_time) VALUES(" +
            "#{uid}, #{code}, #{type}, #{eTime}, #{cTime})")
    void insert(ActiveCode activeCode);

    @Update("UPDATE " + TABLE + " SET is_use = #{status} WHERE code = #{code}")
    void update(@Param("code") String code,
                @Param("status") Integer status);
}
