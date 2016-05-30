package com.yew1eb.service;


import com.yew1eb.Bootstrap;
import com.yew1eb.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Bootstrap.class)
public class UserServiceTests {

    @Autowired
    private UserService userSerivce;


    @Test
    public void test() throws Exception {
        User user = userSerivce.findUserById(2L);
        System.out.println(user);
        //Assert.assertEquals(3, userSerivce.getAllUser().size());
    }
}
