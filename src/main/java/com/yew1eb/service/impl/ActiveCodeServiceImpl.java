package com.yew1eb.service.impl;

import com.yew1eb.model.ActiveCode;
import com.yew1eb.model.User;
import com.yew1eb.service.ActiveCodeService;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
public class ActiveCodeServiceImpl implements ActiveCodeService {
    @Override
    public ActiveCode getActivecode(String code) {
        return null;
    }

    @Override
    public String save(User user, String type) {
        return null;
    }

    @Override
    public boolean useCode(String code) {
        return false;
    }

    @Override
    public boolean resend(Long uid) {
        return false;
    }
}
