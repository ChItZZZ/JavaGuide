package org.shzhong.thread.localdemo;

public class LocalTest {
    private static ThreadLocal<String> localVal = new ThreadLocal<>();

    static void print() {
        System.out.println(localVal.get());
    }

    public static void main(String[] args) {
        new Thread(() -> {
            localVal.set("one");
            print();
        }).start();

        new Thread(() -> {
            localVal.set("two");
            print();
        }).start();
    }
}
