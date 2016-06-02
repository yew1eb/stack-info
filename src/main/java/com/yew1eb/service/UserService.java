package com.yew1eb.service;

import com.yew1eb.model.LoginUser;
import com.yew1eb.model.User;
import com.yew1eb.util.Page;
import com.yew1eb.util.QueryParam;

import java.util.List;
import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

public interface UserService {

    User getUser(Long uid);

    User getUserByLoginName(String loginName);

    User getUser(QueryParam queryParam);

    Map<String, Object> getUserDetail(Long uid);

    List<User> getUserList(QueryParam queryParam);

    List<User> getUserList(Long offset, Long limit);

    Page<User> getPageList(QueryParam queryParam);

    User signup(String loginName, String passWord, String email);

    User signin(String loginName, String passWord);

    LoginUser getLoginUser(User user, Long uid);

    boolean hasUser(String login_name);

    boolean delete(Long uid);

    boolean updateStatus(Long uid, Integer status);

    boolean resetPwd(String email);

    boolean updateAvatar(Long uid, String avatar_path);

    boolean updatePwd(Long uid, String new_pwd);

    boolean updateRole(Long uid, Integer role_id);
}
