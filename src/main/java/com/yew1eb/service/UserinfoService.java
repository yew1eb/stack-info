package com.yew1eb.service;

import com.yew1eb.model.UserInfo;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;

import java.util.List;

public interface UserInfoService {

    UserInfo getUserInfo(Long uid);

    List<UserInfo> getUserInfoList(QueryParam queryParam);

    Page<UserInfo> getPageList(QueryParam queryParam);

    boolean save(Long uid);

    boolean update(Long uid, String nickName, String jobs, String webSite, String github, String weibo, String location, String signature, String instructions);

    boolean delete(Long uid);

}
