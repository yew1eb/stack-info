package com.yew1eb.util;

import java.text.SimpleDateFormat;
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

    public static String getToday(String format) {
        String result = "";
        try {
            Date today = new Date();
            SimpleDateFormat simpleFormat = new SimpleDateFormat(format);
            result = simpleFormat.format(today);
        } catch (Exception e) {
        }
        return result;
    }
}
