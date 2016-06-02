package com.yew1eb.service;

import com.yew1eb.model.TopicCount;

public interface TopicCountService {
	
	TopicCount getCount(Long tid);
	
	boolean update(String type, Long tid, Integer count);
	
	boolean save(Long tid, Integer create_time);
	
}
