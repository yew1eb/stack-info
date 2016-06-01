package com.yew1eb.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouhai
 * @createTime 16/5/31
 * @description
 */

@Configuration
@EnableScheduling
public class EchoTask {
    private static final Logger LOG = LoggerFactory.getLogger(EchoTask.class);

    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");


    @Scheduled(cron = "0/30 * * * * ?") // 每20秒执行一次
    public void echo() {
        long curTime = System.currentTimeMillis();
        LOG.info(dateFormat.format(new Date(curTime)) +
                ":Echo Task:run>>>>>>>>>>>>>>>>>>>");
    }
}
