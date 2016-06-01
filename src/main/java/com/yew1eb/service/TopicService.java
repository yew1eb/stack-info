package com.yew1eb.service;

import com.yew1eb.model.Topic;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;

import java.util.List;
import java.util.Map;

public interface TopicService {

    Topic getTopic(Long tid);

    List<Long> topicIds();

    Map<String, Object> getTopicMap(Topic topic, boolean isDetail);

    List<Map<String, Object>> getTopicList(QueryParam queryParam);

    Page<Map<String, Object>> getPageList(QueryParam queryParam);

    Long save(Long uid, Long nid, String title, String content, Integer isTop);

    Long update(Long tid, Long nid, String title, String content);

    boolean comment(Long uid, Long to_uid, Long tid, String content, String ua);

    boolean delete(Long tid);

    boolean refreshWeight();

    boolean updateWeight(Long tid);

    boolean updateWeight(Long tid, Long loves, Long favorites, Long comment, Long sinks, Long create_time);

    Long getTopics(Long uid);

    Long getLastCreateTime(Long uid);

    Long getLastUpdateTime(Long uid);

    Page<Map<String, Object>> getHotTopic(Long nid, Integer page, Integer count);

    Page<Map<String, Object>> getRecentTopic(Long nid, Integer page, Integer count);

    void essence(Long tid, Integer count);

}
