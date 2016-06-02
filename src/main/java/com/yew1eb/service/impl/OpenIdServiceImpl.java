package com.yew1eb.service.impl;

import com.yew1eb.model.OpenId;
import com.yew1eb.service.OpenIdService;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
public class OpenIdServiceImpl implements OpenIdService {
    @Override
    public OpenId getOpenid(String type, Long open_id) {
        return null;
    }

    @Override
    public boolean save(String type, Long open_id, Long uid) {
        return false;
    }

    @Override
    public boolean delete(String type, Long uid) {
        return false;
    }
}
