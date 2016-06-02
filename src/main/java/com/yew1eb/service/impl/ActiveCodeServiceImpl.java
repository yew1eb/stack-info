package com.yew1eb.service.impl;

import com.yew1eb.mapper.ActiveCodeMapper;
import com.yew1eb.model.ActiveCode;
import com.yew1eb.model.User;
import com.yew1eb.service.ActiveCodeService;
import com.yew1eb.service.SendMailService;
import com.yew1eb.service.UserInfoService;
import com.yew1eb.service.UserService;
import com.yew1eb.util.DateUtil;
import com.yew1eb.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class ActiveCodeServiceImpl implements ActiveCodeService {

    @Autowired
    private ActiveCodeMapper activeCodeMapper;

    @Autowired
    private UserInfoService userinfoService;

    @Autowired
    private SendMailService sendMailService;

    @Autowired
    private UserService userService;

    @Override
    public ActiveCode getActivecode(String code) {
        if (!StringUtils.hasLength(code)) {
            return null;
        }
        return activeCodeMapper.getActiveCode(code);
    }

    @Override
    public String save(User user, String type) {
        if (null == user || !StringUtils.hasLength(type)) {
            return null;
        }

        long cTime = DateUtil.getCurrentUnixTime();
        long expires_time = cTime + 3600;
        String code = StringUtil.getRandomString(32);
        try {
            activeCodeMapper.insert(new ActiveCode(user.getUid(), code, type, expires_time, cTime));
            userinfoService.save(user.getUid());

            if (type.equals("signup")) {
                sendMailService.signup(user.getLoginName(), user.getEmail(), code);
            }

            if (type.equals("forgot")) {
                sendMailService.forgot(user.getLoginName(), user.getEmail(), code);
            }
            return code;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean useCode(String code) {
        if (!StringUtils.hasLength(code)) {
            return false;
        }
        try {
            activeCodeMapper.update(code, 1);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean resend(Long uid) {
        if (null != uid) {
            User user = userService.getUser(uid);
            if (null == user) {
                return false;
            }

            long cTime = DateUtil.getCurrentUnixTime();
            long expires_time = cTime + 3600;
            String code = StringUtil.getRandomString(32);
            try {
                activeCodeMapper.insert(new ActiveCode(user.getUid(), code, "signup", expires_time, cTime));
                sendMailService.signup(user.getLoginName(), user.getEmail(), code);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
