package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/14 17:39
 */

/**
 * 前端视频
 */
public class FEVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制前端视频");
    }
}
