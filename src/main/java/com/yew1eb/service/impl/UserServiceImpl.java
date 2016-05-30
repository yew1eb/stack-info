package com.yew1eb.service.impl;

import com.yew1eb.mapper.UserMapper;
import com.yew1eb.service.UserService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void create(String name, Integer age) {
        userMapper.create(name, age);
    }

    @Override
    public void deleteByName(String name) {
        userMapper.deleteByName(name);
    }

    @Override
    public Integer getAllUsers() {
        return userMapper.getAllUsers();
    }
}
