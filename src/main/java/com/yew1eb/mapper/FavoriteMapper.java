package com.yew1eb.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public interface FavoriteMapper {
    String TABLE = "t_favorite";

    @Select("SELECT COUNT(1) FROM " + TABLE + " WHERE type=#{type} AND uid=#{uid} AND event_id=#{eventId}")
    Long getCount(@Param("type") String type,
                  @Param("uid") Long uid,
                  @Param("eventId") Long eventId);

    @Select("SELECT COUNT(1) FROM " + TABLE + " WHERE type=#{type} AND uid=#{uid}")
    Long getCount(@Param("type") String type,
                  @Param("uid") Long uid);
}
