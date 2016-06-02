package com.yew1eb.service;


import com.yew1eb.BaseTest;
import com.yew1eb.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

public class UserServiceTests extends BaseTest{

    @Autowired
    private UserService userSerivce;


    @Test
    public void testGetUserByLoginName() throws Exception {
        User user = userSerivce.getUserByLoginName("test");
        System.out.println(user);
    }
}
