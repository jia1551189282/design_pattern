package com.jia.design.pattern.creational.singleton.v1;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 9:08
 */

/**
 * 单例模式 ：实现方式1
 *  饿汉式
 */
public class Singleton {
    /**
     * 私有的构造器 ，外部就不可以用new的方式来创建对象
     */
    private Singleton(){

    }

    // 类的内部创建实例对象
    private final static Singleton instance = new Singleton();

    // 提供一个静态方法供外部使用
    public static Singleton getInstance(){
        return instance;
    }
}
