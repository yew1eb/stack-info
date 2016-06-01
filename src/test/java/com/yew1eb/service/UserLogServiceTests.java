package com.yew1eb.service;

import com.yew1eb.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */

public class UserLogServiceTests extends BaseTest {

    @Autowired
    private UserLogService userLogService;

    @Test
    public void testUserLogService() {
        userLogService.insert(1L, "/login", "sign in");
    }
}
