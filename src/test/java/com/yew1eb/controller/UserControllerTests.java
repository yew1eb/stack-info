package com.yew1eb.controller;


import com.yew1eb.mapper.UserMapper;
import com.yew1eb.service.UserService;
import com.yew1eb.web.rest.UserController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@RunWith(SpringRunner.class)
@WebMvcTest(UserController.class)
public class UserControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserMapper userMapper;
    @MockBean
    private UserService userService;
    @MockBean
    private UserController userController;

    @Before
    public void init() {
        //this.mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }

    @Test
    public void testUserController() throws Exception {

        RequestBuilder request = null;

        request = get("/test/user").param("id", "4");
        mockMvc.perform(request)
                .andExpect(status().isOk());

        request = get("/test/alluser");
        mockMvc.perform(request)
                .andExpect(status().isOk());
    }


}
