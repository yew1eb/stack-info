package com.yew1eb.service.impl;

import com.yew1eb.model.Settings;
import com.yew1eb.service.SettingsService;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class SettingsServiceImpl implements SettingsService {
    @Override
    public Settings getSettings(String skey) {
        return null;
    }

    @Override
    public Map<String, Object> getSystemInfo() {
        return null;
    }

    @Override
    public boolean save(String svalue) {
        return false;
    }

    @Override
    public boolean delete(String skey) {
        return false;
    }

    @Override
    public boolean updateCount(String skey, int count) {
        return false;
    }

    @Override
    public boolean refreshCount() {
        return false;
    }

    @Override
    public boolean update(String site_title, String site_keywords, String site_description, String allow_signup) {
        return false;
    }
}
