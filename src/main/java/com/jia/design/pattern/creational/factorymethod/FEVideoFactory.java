package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/14 17:40
 */

/**
 * 前端视频工厂类
 */
public class FEVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new FEVideo();
    }
}
