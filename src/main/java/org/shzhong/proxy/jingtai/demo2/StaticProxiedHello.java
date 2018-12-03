package org.shzhong.proxy.jingtai.demo2;

// 静态代理方式
class StaticProxiedHello implements Hello{
    private Hello hello = new HelloImp();
    @Override
    public String sayHello(String str) {
        System.out.println("You said: " + str);
        return hello.sayHello(str);
    }
}