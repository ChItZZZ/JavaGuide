package org.shzhong.basic;

public class StringDemo {

    public static String changeStr(String name) {
        return name + "123";
    }

    public static String change(StringBuilder sb) {
        return sb.append("123").toString();
    }

    public static void main(String[] args) {
        String name = "string";
        StringBuilder sb = new StringBuilder();
        sb.append("sb");
        changeStr(name);
        change(sb);
        System.out.println("name = " + name);
        System.out.println("sb = " + sb);

    }
}
