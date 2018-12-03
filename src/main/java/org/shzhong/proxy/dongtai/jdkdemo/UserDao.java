package org.shzhong.proxy.dongtai.jdkdemo;

public class UserDao implements IUserDao{

    @Override
    public void save() {
        System.out.println("保存数据");
    }
}