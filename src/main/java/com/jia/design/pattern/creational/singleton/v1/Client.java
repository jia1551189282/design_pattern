package com.jia.design.pattern.creational.singleton.v1;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 9:11
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton.hashCode() + "\n" + singleton1.hashCode());
    }
}
