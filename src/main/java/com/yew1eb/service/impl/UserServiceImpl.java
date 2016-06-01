package com.yew1eb.service.impl;

import com.yew1eb.mapper.UserMapper;
import com.yew1eb.model.User;
import com.yew1eb.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/5/31
 * @description
 */

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserMapper userMapper;

    public User findUserById(Long id) {
        User user = null;
        try {
            user = userMapper.findUserById(id);
        } catch (Exception e) {
            LOG.error(" userMapper.findUserById(id={});", id, e);
        }
        return user;
    }

    public List<User> getAllUser(Long offset, Long limit) {
        List<User> users = null;
        try {
            users = userMapper.getAllUser(offset, limit);
        } catch (Exception e) {
            LOG.error("userMapper.getAllUser(offset={}, limit={})", offset, limit, e);
        }
        return users;
    }
}
