package com.yew1eb.service;

import com.yew1eb.BaseTest;
import com.yew1eb.model.ActiveCode;
import com.yew1eb.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */

public class ActiveCodeServiceTests extends BaseTest {

    @Autowired
    private ActiveCodeService activeCodeService;

    @Autowired
    private UserService userService;

    @Test
    public void TestSave() {
        User user = userService.getUserByLoginName("test");
        System.out.println(user);
        activeCodeService.save(user, "signup");
        activeCodeService.save(user, "forgot");
    }

    @Test
    public void TestGetActivecode() {
        String code = "u0ZWmxmZwoIV1EdtjOVxYVSXEFqrBz9f";
        ActiveCode activeCode = activeCodeService.getActivecode(code);
        System.out.println(activeCode);
    }

    @Test
    public void TestUseCode() {
        String code = "u0ZWmxmZwoIV1EdtjOVxYVSXEFqrBz9f";
        activeCodeService.useCode(code);
    }

    @Test
    public void TestResend() {
        Long uid = 25L;
        activeCodeService.resend(uid);
    }
}
