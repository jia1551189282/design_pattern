package com.jia.design.pattern.creational.singleton.v6;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 10:46
 */

/**
 * 懒汉式：
 *      双端检索
 *      解决性能和安全问题，推荐使用
 */
public class Singleton {
    // 用volatile 修饰 ，保证了变量的可见性
    private static volatile Singleton singleton ;
    private Singleton(){

    }

    /**
     * 双重判断，加同步代码块，解决了安全问题，
     * @return
     */
    public static Singleton getInstance(){
        if (singleton == null){
            synchronized (Singleton.class){
                if (singleton == null ){
                    singleton = new Singleton();
                }
            }
        }
        return  singleton;

    }
}
