package com.yew1eb.util;

import java.util.Date;

/**
 * @author zhouhai
 * @createTime 16/6/1
 * @description
 */
public class DateUtil {

    public static long getCurrentUnixTime() {
        return getUnixTimeByDate(new Date());
    }

    public static long getUnixTimeByDate(Date date) {
        return date.getTime() / 1000;
    }
}
