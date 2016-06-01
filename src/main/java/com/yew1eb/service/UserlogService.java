package com.yew1eb.service;

import com.yew1eb.model.UserLog;
import com.yew1eb.util.QueryParam;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public interface UserLogService {

    List<UserLog> getUserlogList(QueryParam queryParam);

    void insert(Long uid, String action, String content);

}
