package com.jia.design.pattern.creational.singleton.v2;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 9:15
 */

/**
 * 饿汉式 ：
 *      静态代码块
 */
public class Singleton {

    private Singleton(){

    }

    private static Singleton singleton ;

    static {
        singleton = new Singleton();
    }

    /**
     * 提供给外面使用的静态方法
     * @return
     */
    public static Singleton getInstance(){
        return singleton;
    }
}
