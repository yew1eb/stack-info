package com.yew1eb.service.impl;

import com.yew1eb.service.FavoriteService;
import com.yew1eb.util.Page;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Override
    public boolean isFavorite(String type, Long uid, Long event_id) {
        return false;
    }

    @Override
    public Page<Map<String, Object>> getMyTopics(Long uid, Integer page, Integer count) {
        return null;
    }

    @Override
    public Page<Map<String, Object>> getFollowing(Long uid, Integer page, Integer count) {
        return null;
    }

    @Override
    public List<Map<String, Object>> getMyNodes(Long uid) {
        return null;
    }

    @Override
    public Integer update(String type, Long uid, Long eventId) {
        return null;
    }

    @Override
    public Long favorites(String type, Long uid) {
        return null;
    }
}
