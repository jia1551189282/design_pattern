package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/14 17:31
 */

/**
 * 创建 python 课程的工厂类
 */
public class PythonVideoFactory extends VideoFactory {


    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
