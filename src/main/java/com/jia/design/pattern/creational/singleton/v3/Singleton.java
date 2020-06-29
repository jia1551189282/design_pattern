package com.jia.design.pattern.creational.singleton.v3;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 10:37
 */

/**
 * 懒汉式 :
 *      存在多线程安全问题
 */
public class Singleton {

    private static Singleton singleton ;
    private Singleton(){

    }

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
