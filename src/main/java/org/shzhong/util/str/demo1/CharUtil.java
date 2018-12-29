package org.shzhong.util.str.demo1;

import java.util.Random;

public class CharUtil {

    public static final String RANDOM_STR = "abcdefghijklmnopqrstuvwxyz0123456789";
    public static final String RANDOM_NUM = "0123456789";

    public static String getRandom(Integer num, String base) {
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < num; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }

    public static String getRandomString(Integer num) {
        return getRandom(num, RANDOM_STR);
    }

    public static String getRandomNum(Integer num) {
        return getRandom(num, RANDOM_NUM);
    }

}
