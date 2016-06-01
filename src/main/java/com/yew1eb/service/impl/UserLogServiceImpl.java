package com.yew1eb.service.impl;

import com.yew1eb.mapper.UserLogMapper;
import com.yew1eb.model.UserLog;
import com.yew1eb.service.UserLogService;
import com.yew1eb.util.DateUtil;
import com.yew1eb.util.QueryParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */

@Service
public class UserLogServiceImpl implements UserLogService {
    private static final Logger LOG = LoggerFactory.getLogger(UserLogServiceImpl.class);

    @Autowired
    private UserLogMapper userLogMapper;

    @Override
    public List<UserLog> getUserlogList(QueryParam queryParam) {
        // TODO not used ...
        return null;
    }

    @Override
    public void insert(Long uid, String action, String content) {
        LOG.info("insert, uid={}, action={}, content={}, ip={}", uid, action, content, 0);
        final String ip = "0.0.0.0";
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    userLogMapper.insert(new UserLog(uid, action, content, ip, DateUtil.getCurrentUnixTime()));
                } catch (Exception e) {
                    LOG.error("userLogMapper.insert failed, uid={}, action={}, content={}, ip={}", uid, action, content, ip, e);
                }
            }
        };
        Executors.newSingleThreadExecutor().submit(runnable);
    }
}
