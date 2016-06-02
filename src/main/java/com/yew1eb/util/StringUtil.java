package com.yew1eb.util;

import java.util.Random;

/**
 * @author zhouhai
 * @createTime 16/6/2
 * @description
 */
public class StringUtil {
    private static final String RANDOM_CHAR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";


    public static String getRandomString(int size) {
        String sRand = "";
        Random random = new Random();// 创建一个随机类
        for (int i = 0; i < size; i++) {
            String ch = String.valueOf(RANDOM_CHAR.charAt(random.nextInt(RANDOM_CHAR.length())));
            sRand += ch;
        }
        return sRand;
    }
}
