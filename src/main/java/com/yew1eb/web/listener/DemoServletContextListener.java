package com.yew1eb.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
@WebListener(value = "DemoServletContextListener")
public class DemoServletContextListener implements ServletContextListener {

    private static final Logger LOG = LoggerFactory.getLogger(DemoServletContextListener.class);

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        LOG.info("DemoServletContextListener init ...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        LOG.info("DemoServletContextListener destroyed ...");
    }
}
