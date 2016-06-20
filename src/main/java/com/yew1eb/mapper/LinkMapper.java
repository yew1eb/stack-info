package com.yew1eb.mapper;

import com.yew1eb.model.Link;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public interface LinkMapper {
    String FIELDS = "id,title,url,c_time";
    String TABLE = "t_link";

    @Select("SELECT "+FIELDS+" FROM "+TABLE+"WHERE id = #{id}")
    Link getLinkById(@Param("id") Long id);
}
