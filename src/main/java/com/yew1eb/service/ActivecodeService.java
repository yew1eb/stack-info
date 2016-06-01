package com.yew1eb.service;

import com.yew1eb.model.User;
import com.yew1eb.model.ActiveCode;

public interface ActiveCodeService {

    ActiveCode getActivecode(String code);

    String save(User user, String type);

    boolean useCode(String code);

    boolean resend(Long uid);
}
