package com.yew1eb.service.impl;

import com.yew1eb.mapper.UserMapper;
import com.yew1eb.model.LoginUser;
import com.yew1eb.model.User;
import com.yew1eb.service.UserService;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Map;

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

    public List<User> getUserList(Long offset, Long limit) {
        List<User> users = null;
        try {
            users = userMapper.getAllUser(offset, limit);
        } catch (Exception e) {
            LOG.error("userMapper.getAllUser(offset={}, limit={})", offset, limit, e);
        }
        return users;
    }

    @Override
    public User getUser(Long uid) {
        User user = null;
        try {
            user = userMapper.getUserById(uid);
        } catch (Exception e) {
            LOG.error(" userMapper.findUserById(id={});", uid, e);
        }
        return user;
    }

    @Override
    public User getUserByLoginName(String loginName) {
        if (!StringUtils.hasLength(loginName)) {
            return null;
        }
        return userMapper.getUserByLoginName(loginName);
    }

    @Override
    public User getUser(QueryParam queryParam) {
        return null;
    }

    @Override
    public Map<String, Object> getUserDetail(Long uid) {
        return null;
    }

    @Override
    public List<User> getUserList(QueryParam queryParam) {
        return null;
    }

    @Override
    public Page<User> getPageList(QueryParam queryParam) {
        return null;
    }

    @Override
    public User signup(String loginName, String passWord, String email) {
        return null;
    }

    @Override
    public User signin(String loginName, String passWord) {
        return null;
    }

    @Override
    public LoginUser getLoginUser(User user, Long uid) {
        return null;
    }

    @Override
    public boolean hasUser(String login_name) {
        return false;
    }

    @Override
    public boolean delete(Long uid) {
        return false;
    }

    @Override
    public boolean updateStatus(Long uid, Integer status) {
        return false;
    }

    @Override
    public boolean resetPwd(String email) {
        return false;
    }

    @Override
    public boolean updateAvatar(Long uid, String avatar_path) {
        return false;
    }

    @Override
    public boolean updatePwd(Long uid, String new_pwd) {
        return false;
    }

    @Override
    public boolean updateRole(Long uid, Integer role_id) {
        return false;
    }
}
