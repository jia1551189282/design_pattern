package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/14 17:30
 */

/**
 * 创建java 课程的的工厂类
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
