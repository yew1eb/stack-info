package com.yew1eb.service.impl;

import com.yew1eb.model.OpenId;
import com.yew1eb.service.OpenIdService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
@Service
public class OpenIdServiceImpl implements OpenIdService {
    @Override
    public OpenId getOpenid(String type, Long open_id) {
        if (null == open_id || !StringUtils.hasLength(type)) {
            return null;
        }
        //OpenId openId = AR.find("select * from t_openid where open_id = ? and type = ?", open_id, type).first(Openid.class);
        return null;
    }

    @Override
    public boolean save(String type, Long open_id, Long uid) {
        /*
        if(StringKit.isNotBlank(type) && null != open_id && null != uid){
			try {

				Long count = AR.find("select count(1) from t_openid where open_id = ? and type = ? and uid = ?", open_id, type, uid).first(Long.class);
				if(count == 0){
					AR.update("insert into t_openid(type, open_id, uid, create_time) values(?, ?, ?, ?)", type, open_id,
							uid, DateKit.getCurrentUnixTime()).executeUpdate();
				}
				return true;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
         */
        return false;
    }

    @Override
    public boolean delete(String type, Long uid) {
        /*
        if(null != open_id && StringKit.isNotBlank(type)){
			AR.update("delete from t_openid where type = ? and open_id = ?", type, open_id).executeUpdate();
			return true;
		}
         */
        return false;
    }
}
