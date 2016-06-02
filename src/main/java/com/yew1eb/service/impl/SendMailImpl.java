package com.yew1eb.service.impl;

import com.yew1eb.service.SendMailService;
import com.yew1eb.service.UserLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */

@Service
public class SendMailImpl implements SendMailService {
    private static final Logger LOG = LoggerFactory.getLogger(SendMailImpl.class);

    @Override
    public void signup(String username, String email, String code) {
        LOG.info("user {} signup, send mail [{}] success, code = [{}]", username, email, code);
    }

    @Override
    public void forgot(String username, String email, String code) {
        LOG.info("user {} forgot, send mail [{}] success, code = [{}]", username, email, code);
    }
}
