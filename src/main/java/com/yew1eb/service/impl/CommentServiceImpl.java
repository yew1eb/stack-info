package com.yew1eb.service.impl;

import com.yew1eb.mapper.CommentMapper;
import com.yew1eb.model.Comment;
import com.yew1eb.service.CommentService;
import com.yew1eb.service.TopicService;
import com.yew1eb.service.UserService;
import com.yew1eb.util.DateUtil;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserService userService;

    @Autowired
    private TopicService topicService;

    @Autowired
    private CommentMapper commentMapper;

    @Override
    public Comment getComment(Long cid) {
        return commentMapper.getComment(cid);
    }

    @Override
    public Comment getTopicLastComment(Long tid) {
        return commentMapper.getCommentByTid(tid);
    }

    @Override
    public List<Comment> getCommentList(QueryParam queryParam) {
        if (null != queryParam) {
            //return AR.find(queryParam).list(Comment.class);
        }
        return null;
    }

    @Override
    public Page<Map<String, Object>> getPageListMap(QueryParam queryParam) {
        if (null != queryParam) {
            //Page<Comment> commentPage = AR.find(queryParam).page(Comment.class);
            //return this.getCommentPageMap(commentPage);
        }
        return null;
    }

    @Override
    public Integer save(Long uid, Long toUid, Long tid, String content, String UA) {
        try {
            Integer cid = commentMapper.insert(new Comment(uid, toUid, tid, content, UA, DateUtil.getCurrentUnixTime()));
            return cid;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean delete(Long cid) {
        if(null != cid){
            commentMapper.delete(cid);
            return true;
        }
        return false;
    }

    @Override
    public Long getComments(Long uid) {
        if(null != uid){
            return commentMapper.getComments(uid);
        }
        return 0L;
    }
}
