package com.yew1eb.service.impl;

import com.yew1eb.mapper.TopicCountMapper;
import com.yew1eb.model.TopicCount;
import com.yew1eb.service.TopicCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class TopicCountServiceImpl implements TopicCountService {

    @Autowired
    private TopicCountMapper topicCountMapper;

    @Override
    public TopicCount getCount(Long tid) {
        return topicCountMapper.getUserById(tid);
    }

    @Override
    public boolean update(String type, Long tid, Integer count) {
        if( !StringUtils.hasLength(type) || null == tid){
            return false;
        }
        TopicCount topicCount = this.getCount(tid);
        if(null != topicCount){
            // TODO 可能还有问题
            topicCountMapper.update(type, tid, count);
        }
        return false;
    }

    @Override
    public boolean save(Long tid, Integer cTime) {
        try {
            if(null == tid || tid < 1){
                return false;
            }
            topicCountMapper.insert(tid, cTime);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
