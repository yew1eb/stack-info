package com.yew1eb.service.impl;

import com.yew1eb.model.Comment;
import com.yew1eb.service.CommentService;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Override
    public Comment getComment(Long cid) {
        return null;
    }

    @Override
    public Comment getTopicLastComment(Long tid) {
        return null;
    }

    @Override
    public List<Comment> getCommentList(QueryParam queryParam) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getPageListMap(QueryParam queryParam) {
        return null;
    }

    @Override
    public Long save(Long uid, Long toUid, Long tid, String content, String ua) {
        return null;
    }

    @Override
    public boolean delete(Long cid) {
        return false;
    }

    @Override
    public Long getComments(Long uid) {
        return null;
    }
}
