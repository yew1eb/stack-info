package com.yew1eb.service;

import com.yew1eb.mapper.UserMapper;
import com.yew1eb.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@Service
public class UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Long id) {
        LOG.info("findUserById : {}", id);
        User user = userMapper.findUserById(id);
        return user;
    }

    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
