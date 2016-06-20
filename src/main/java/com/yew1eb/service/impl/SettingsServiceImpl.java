package com.yew1eb.service.impl;

import com.yew1eb.model.Settings;
import com.yew1eb.service.SettingsService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
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
        // return AR.findById(Settings.class, skey);
        return null;
    }

    @Override
    public Map<String, Object> getSystemInfo() {
        Map<String, Object> map = new HashMap<String, Object>();
        //List<Settings> settings = AR.find("select * from t_settings").cache(false).list(Settings.class);
        //if(CollectionKit.isNotEmpty(settings)){
        //   for(Settings setting : settings){
        //        map.put(setting.getSkey(), setting.getSvalue());
        //    }
        //}
        return map;
    }

    @Override
    public boolean save(String svalue) {
        return false;
    }

    @Override
    public boolean delete(String skey) {
        if(null != skey){
            //AR.update("delete from t_settings where skey = ?", skey).executeUpdate();
            return true;
        }
        return false;
    }

    @Override
    public boolean updateCount(String skey, int count) {
        /*
        try {
			if (StringKit.isNotBlank(skey) && count != 0) {
				Settings settings = AR.findById(Settings.class, skey);
				if (null != settings) {
					if (StringKit.isNumber(settings.getSvalue().trim())) {
						Long cur_count = Long.valueOf(settings.getSvalue().trim());
						String val = (cur_count + count) + "";
						AR.update("update t_settings set svalue = ? where skey = ?", val, skey).executeUpdate();
						return true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
         */
        return false;
    }

    @Override
    public boolean refreshCount() {
        /*
        Long comments = AR.find("select count(1) from t_comment").first(Long.class);
		Long users = AR.find("select count(1) from t_user where status = 1").first(Long.class);
		Long topics = AR.find("select count(1) from t_topic where status = 1").first(Long.class);

		AR.update("update t_settings set svalue = ? where skey = ?", users, Types.user_count.toString()).executeUpdate();
		AR.update("update t_settings set svalue = ? where skey = ?", comments, Types.comment_count.toString()).executeUpdate();
		AR.update("update t_settings set svalue = ? where skey = ?", topics, Types.topic_count.toString()).executeUpdate();
        */
        return false;
    }

    @Override
    public boolean update(String site_title, String site_keywords, String site_description, String allow_signup) {
        /*
        try {
			if (StringKit.isNotBlank(site_title)) {
				AR.update("update t_settings set svalue = ? where skey = ?", site_title, "site_title")
						.executeUpdate(true);
			}
			if (StringKit.isNotBlank(site_keywords)) {
				AR.update("update t_settings set svalue = ? where skey = ?", site_keywords, "site_keywords")
						.executeUpdate(true);
			}
			if (StringKit.isNotBlank(site_description)) {
				AR.update("update t_settings set svalue = ? where skey = ?", site_description, "site_description")
						.executeUpdate(true);
			}
			if (StringKit.isNotBlank(allow_signup)) {
				AR.update("update t_settings set svalue = ? where skey = ?", allow_signup, "allow_signup")
						.executeUpdate(true);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
         */
        return false;
    }
}
