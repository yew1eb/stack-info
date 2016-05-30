package com.yew1eb.controller;

import com.yew1eb.model.User;
import com.yew1eb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */


@RestController
@RequestMapping(value = "/test")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user")
    @ResponseBody
    public User findUserById(@RequestParam(name = "id") int id) {
        User user = userService.findUserById(id);
        return user;
    }

    @RequestMapping("/alluser")
    @ResponseBody
    public List<User> getAllUser() {
        return userService.getAllUser();
    }
}
