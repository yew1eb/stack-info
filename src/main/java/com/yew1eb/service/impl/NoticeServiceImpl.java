package com.yew1eb.service.impl;

import com.yew1eb.service.NoticeService;
import com.yew1eb.util.Page;

import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
public class NoticeServiceImpl implements NoticeService {
    @Override
    public boolean save(String type, Long to_uid, Long event_id) {
        return false;
    }

    @Override
    public boolean read(Long to_uid) {
        return false;
    }

    @Override
    public Page<Map<String, Object>> getNoticePage(Long to_uid, Integer page, Integer count) {
        return null;
    }

    @Override
    public Long getNotices(Long to_uid) {
        return null;
    }
}
