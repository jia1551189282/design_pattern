package com.jia.design.pattern.creational.singleton.v4;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 10:43
 */

import java.security.SignedObject;

/**
 * 懒汉式2：
 *      解决了多线程问题，存在性能问题
 */
public class Singleton {

    private static Singleton singleton ;

    private Singleton(){

    }

    /**
     * 加 synchronized 保证了不出现线程安全问题，但是严重影响性能
     * @return
     */
    public synchronized static Singleton getInstance(){
        if (singleton == null ){
            singleton = new Singleton();
        }
        return singleton;
    }

}
