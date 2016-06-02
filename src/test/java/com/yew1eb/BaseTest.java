package com.yew1eb;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseTest {

    @Test
    public void init() {
        System.out.println("Junit start ...");
    }
}
