package org.shzhong.util.str.demo1;

import sun.text.resources.FormatData;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Demo {

    public static String formatData(){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
        return sdf.format(new Date());

    }
    public static void main(String[] args) {
        String randomNum = CharUtil.getRandomNum(12);
        System.out.println(Long.parseLong(randomNum));
        System.out.println(Long.MAX_VALUE);
        System.out.println(LocalDateTime.now());

        System.out.println(formatData());

    }
}
