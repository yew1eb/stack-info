package com.yew1eb.service.impl;

import com.yew1eb.mapper.UserInfoMapper;
import com.yew1eb.model.UserInfo;
import com.yew1eb.service.UserInfoService;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserInfo(Long uid) {
        return userInfoMapper.getUserInfo(uid);
    }

    @Override
    public List<UserInfo> getUserInfoList(QueryParam queryParam) {
        return null;
    }

    @Override
    public Page<UserInfo> getPageList(QueryParam queryParam) {
        return null;
    }

    @Override
    public boolean save(Long uid) {
        return false;
    }

    @Override
    public boolean update(Long uid, String nickName, String jobs, String webSite, String github, String weibo, String location, String signature, String instructions) {
        return false;
    }

    @Override
    public boolean delete(Long uid) {
        return false;
    }
}
