package com.yew1eb.service;

import com.yew1eb.util.Page;

import java.util.Map;

public interface NoticeService {
	
	boolean save(String type, Long to_uid, Long event_id);
	
	boolean read(Long to_uid);
	
	Page<Map<String, Object>> getNoticePage(Long to_uid, Integer page, Integer count);

	Long getNotices(Long to_uid);
	
}
