package com.yew1eb.service;


import com.yew1eb.model.Comment;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;

import java.util.List;
import java.util.Map;

public interface CommentService {

    Comment getComment(Long cid);

    Comment getTopicLastComment(Long tid);

    List<Comment> getCommentList(QueryParam queryParam);

    Page<Map<String, Object>> getPageListMap(QueryParam queryParam);

    Integer save(Long uid, Long toUid, Long tid, String content, String ua);

    boolean delete(Long cid);

    Long getComments(Long uid);

}
