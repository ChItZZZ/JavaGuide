package org.shzhong.proxy.jingtai.demo2;

// 实现
public class HelloImp implements Hello{
    @Override
    public String sayHello(String str) {
        return "HelloImp: " + str;
    }
}