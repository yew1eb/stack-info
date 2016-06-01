package com.yew1eb.service;

import com.yew1eb.util.Page;

import java.util.List;
import java.util.Map;

public interface FavoriteService {
	
	boolean isFavorite(String type, Long uid, Long event_id);
	
	// 查询我收藏的帖子
	Page<Map<String, Object>> getMyTopics(Long uid, Integer page, Integer count);
	
	// 查询我关注的用户
	Page<Map<String, Object>> getFollowing(Long uid, Integer page, Integer count);
	
	// 查询我收藏的节点
	List<Map<String, Object>> getMyNodes(Long uid);
	
	Integer update(String type, Long uid, Long eventId);
	
	Long favorites(String type, Long uid);
}
