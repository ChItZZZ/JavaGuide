package org.shzhong.basic;

import java.util.ArrayList;

public class Demo1 {

    public static final Object resourceA = new Object();
    public static final Object resourceB = new Object();

    public static void main(String[] args) {
        synchronized (resourceA) {
            ArrayList<Integer> integers = new ArrayList<>();

            integers.add(111);
            integers.add(222);
            integers.add(333);

            integers.forEach(System.out::println);
            synchronized (resourceB) {
                ArrayList<String> strings = new ArrayList<>();
                strings.add("1");
                strings.add("2");
                strings.add("3");
                strings.forEach(System.out::println);
            }
        }

    }
}
