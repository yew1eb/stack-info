package com.yew1eb.mapper;

import com.yew1eb.model.TopicCount;
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
public interface TopicCountMapper {
    String FIELDS = "tid,views,loves,favorites,comments,sinks,c_time";
    String TABLE = "t_topiccount";

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " WHERE tid = #{tid}")
    TopicCount getUserById(@Param("tid") Long tid);

    @Update("UPDATE " + TABLE +" SET #{type}=(#{type}+${count}) WHERE tid = #{tid}")
    void update(@Param("type") String type,
                @Param("tid") Long tid,
                @Param("count") Integer count);

    @Insert("INSERT INTO "+TABLE+"("+FIELDS+") VALUES(#{tid}, 0, 0, 0, 0, 0, #{cTime})")
    void insert(@Param("tid") Long tid,
                @Param("cTime") Integer cTime);
}
