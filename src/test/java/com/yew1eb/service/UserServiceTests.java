package com.yew1eb.service;


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
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTests {

    @Autowired
    private UserService userSerivce;


    @Test
    public void test() throws Exception {
        User user = userSerivce.findUserById(2L);
        System.out.println(user);

        List<User> users = userSerivce.getAllUser(1L, 4L);
        for (User user1 : users) {
            System.out.println(user);
        }
    }
}
