package com.jia.design.pattern.creational.singleton.v3;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 10:40
 */
public class Client {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();

        System.out.println(singleton + "\n" + singleton1);

    }
}
