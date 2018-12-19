package org.shzhong.generic;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Generic<T extends Number>{
    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey(){
        return key;
    }
    public void showKeyValue1(Generic<? extends Number> obj){
        log.info("泛型测试","key value is " + obj.getKey());
    }
    //在泛型方法中添加上下边界限制的时候，必须在权限声明与返回值之间的<T>上添加上下边界，即在泛型声明的时候添加
    //public <T> T showKeyName(Generic<T extends Number> container)，编译器会报错："Unexpected bound"
//    泛型的上下边界添加，必须与泛型的声明在一起 。
    public <T extends Number> T showKeyName(Generic<T> container){
        System.out.println("container key :" + container.getKey());
        T test = container.getKey();
        return test;
    }

}