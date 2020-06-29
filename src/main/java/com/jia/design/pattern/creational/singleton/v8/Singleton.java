package com.jia.design.pattern.creational.singleton.v8;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 10:57
 */

/**
 * 使用枚举实现单例
 */
public enum Singleton {
    INSTANCE;
    public void sayHello(){
        System.out.println("hello");
    }
}
