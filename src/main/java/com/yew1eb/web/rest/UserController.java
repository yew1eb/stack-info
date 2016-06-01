package com.yew1eb.web.rest;

import com.yew1eb.model.User;
import com.yew1eb.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Long")
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User findUserById(@RequestParam(name = "id", defaultValue = "1") Long id) {
        User user = userService.getUser(id);
        return user;
    }

    @ApiOperation(value = "获取用户列表", notes = "")
    @RequestMapping(value = "/alluser", method = RequestMethod.GET)
    public List<User> getAllUser(@RequestParam(name = "offset", defaultValue = "1") Long offset,
                                 @RequestParam(name = "limit", defaultValue = "10") Long limit) {
        return userService.getUserList(offset, limit);
    }
}
