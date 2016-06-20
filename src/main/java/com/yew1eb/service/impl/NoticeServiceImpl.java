package com.yew1eb.service.impl;

import com.yew1eb.service.CommentService;
import com.yew1eb.service.NoticeService;
import com.yew1eb.service.TopicService;
import com.yew1eb.service.UserService;
import com.yew1eb.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private TopicService topicService;

    @Autowired
    private UserService userService;

    @Autowired
    private CommentService commentService;

    @Override
    public boolean save(String type, Long to_uid, Long event_id) {
        /*
        if(StringKit.isNotBlank(type) && null != to_uid && null != event_id){
            AR.update("insert into t_notice(type, to_uid, event_id, create_time) values(?, ?, ?, ?)", type,
                    to_uid, event_id, DateKit.getCurrentUnixTime()).executeUpdate();
            return true;
        }
        */
        return false;
    }

    @Override
    public boolean read(Long to_uid) {
        if(null != to_uid){
            // 删除
            try {
                //AR.update("update t_notice set is_read = 1 where to_uid = ?", to_uid).executeUpdate(true);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public Page<Map<String, Object>> getNoticePage(Long to_uid, Integer page, Integer count) {
        /*
        if(null != uid){
            if(null == page || page < 1){
                page = 1;
            }
            if(null == count || count < 1){
                count = 10;
            }
            QueryParam queryParam = QueryParam.me();
            queryParam.eq("to_uid", uid).orderby("id desc").page(page, count);
            Page<Notice> noticePage = AR.find(queryParam).page(Notice.class);
            return this.getNoticePageMap(noticePage);
        }
        */
        return null;
    }

    @Override
    public Long getNotices(Long to_uid) {
        /*
        if(null != uid){
            return AR.find("select count(1) from t_notice where to_uid = ? and is_read = 0", uid).first(Long.class);
        }
        */
        return null;
    }
}
