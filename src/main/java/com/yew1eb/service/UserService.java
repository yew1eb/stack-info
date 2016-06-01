package com.yew1eb.service;

import com.yew1eb.model.User;

import java.util.List;

/**
 * @author zhouhai
 * @createTime 16/5/29
 * @description
 */

public interface UserService {

    User findUserById(Long id);

    List<User> getAllUser(Long offset, Long limit);
}
