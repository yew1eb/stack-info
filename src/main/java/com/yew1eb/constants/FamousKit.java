package com.yew1eb.constants;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yew1eb.util.DateUtil;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class FamousKit {

    private static final Map<String, FamousDay> pools = new HashMap<String, FamousDay>(2);

    public static FamousDay getTodayFamous() {
        String today = DateUtil.getToday("yyyy-MM-dd");
        if (null != pools.get(today)) {
            return pools.get(today);
        }
        pools.clear();
        FamousDay famousDay = new FamousDay();
        if (StringUtils.hasLength(Constant.FAMOUS_KEY)) {
            String body =""; // TODO HttpRequest.get("http://api.avatardata.cn/MingRenMingYan/Random?key=" + Constant.FAMOUS_KEY).body();
            if (StringUtils.hasLength(body)) {
                JSONObject jsonObject = JSON.parseObject(body).getJSONObject("result");
                String famous_saying = jsonObject.getString("famous_saying");
                String famous_name = jsonObject.getString("famous_name");
                famousDay.setFamous_saying(famous_saying);
                famousDay.setFamous_name(famous_name);
            }
        } else {
            famousDay.setFamous_saying("好奇的目光常常可以看到比他所希望看到的东西更多。");
            famousDay.setFamous_name("莱辛");
        }
        pools.put(today, famousDay);
        return famousDay;
    }

}
