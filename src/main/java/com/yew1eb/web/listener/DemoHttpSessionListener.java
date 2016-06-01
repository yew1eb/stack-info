package com.yew1eb.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
@WebListener(value = "DemoHttpSessionListener")
public class DemoHttpSessionListener implements HttpSessionListener {
    private static final Logger LOG = LoggerFactory.getLogger(DemoHttpSessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        LOG.info("DemoHttpSessionListener created ...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        LOG.info("DemoHttpSessionListener destroyed ...");
    }
}
/*
*  为什么无法看到session的过程:
*  http://zhidao.baidu.com/link?url=EP- wlLvKpo8zI5NaIZrESzCdivq3Xg8VgOWQOvfpSLl3opTgvESerpo4wsG6tOs_dm6cQQMF_kQ6THNjNzr2Nq
* */