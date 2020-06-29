package com.jia.design.pattern.creational.singleton.v7;

/**
 * @author ZJJ
 * @date 2020/6/29 0029 上午 10:51
 */

/**
 * 静态内部类的方式
 */
public class Singleton {
    private static Singleton singleton;
    private Singleton(){}

    private static class  SingletonInstance{
        private static Singleton singleton = new Singleton();
    }

    /**
     * 静态内部类只能在类内部使用,
     * 所以不存在在类外面是其 加载，从而创建对象，只会在我们调用的时候才会创建。
     * @return 单例对象
     */
    public static synchronized Singleton getInstance(){
        Singleton singleton = SingletonInstance.singleton;
        return  singleton;
    }
}
