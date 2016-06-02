package com.yew1eb.service.impl;

import com.yew1eb.model.Topic;
import com.yew1eb.service.TopicService;
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
public class TopicServiceImpl implements TopicService {
    @Override
    public Topic getTopic(Long tid) {
        return null;
    }

    @Override
    public List<Long> topicIds() {
        return null;
    }

    @Override
    public Map<String, Object> getTopicMap(Topic topic, boolean isDetail) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getTopicList(QueryParam queryParam) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getPageList(QueryParam queryParam) {
        return null;
    }

    @Override
    public Long save(Long uid, Long nid, String title, String content, Integer isTop) {
        return null;
    }

    @Override
    public Long update(Long tid, Long nid, String title, String content) {
        return null;
    }

    @Override
    public boolean comment(Long uid, Long to_uid, Long tid, String content, String ua) {
        return false;
    }

    @Override
    public boolean delete(Long tid) {
        return false;
    }

    @Override
    public boolean refreshWeight() {
        return false;
    }

    @Override
    public boolean updateWeight(Long tid) {
        return false;
    }

    @Override
    public boolean updateWeight(Long tid, Long loves, Long favorites, Long comment, Long sinks, Long create_time) {
        return false;
    }

    @Override
    public Long getTopics(Long uid) {
        return null;
    }

    @Override
    public Long getLastCreateTime(Long uid) {
        return null;
    }

    @Override
    public Long getLastUpdateTime(Long uid) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getHotTopic(Long nid, Integer page, Integer count) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getRecentTopic(Long nid, Integer page, Integer count) {
        return null;
    }

    @Override
    public void essence(Long tid, Integer count) {

    }
}
