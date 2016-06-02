package com.yew1eb.mapper;

import com.yew1eb.model.Comment;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public interface CommentMapper {
    String FIELDS = "cid,uid,to_uid,tid,content,device,c_time";
    String TABLE = "t_comment";

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " WHERE cid = #{cid}")
    Comment getComment(@Param("cid") Long cid);

    @Select("SELECT " + FIELDS + " FROM " + TABLE + " WHERE tid = #{tid} ORDER BY cid DESC")
    Comment getCommentByTid(@Param("tid") Long tid);

    @Select("INSERT INTO " + TABLE + "(" + FIELDS + ") " +
            "VALUES(#{cid}, #{uid}, #{toUid}, #{tid}, #{content}, #{device}, #{cTime})")
    @Options(useGeneratedKeys = true, keyProperty = "cid")
        //TODO 插入数据无法返回主键值
    Integer insert(Comment comment);

    @Delete("DELETE FROM " + TABLE + " WHERE cid = #{cid}")
    void delete(@Param("cid") Long cid);

    @Select("SELECT COUNT(1) FROM " + TABLE + " WHERE uid = ${uid}")
    Long getComments(@Param("uid") Long uid);
}
