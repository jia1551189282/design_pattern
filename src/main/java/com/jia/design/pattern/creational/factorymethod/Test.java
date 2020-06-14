package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/3 20:47
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

        VideoFactory videoFactory1 = new PythonVideoFactory();
        Video video1 = videoFactory1.getVideo();
        video1.produce();

        VideoFactory videoFactory2 = new FEVideoFactory();
        Video video2 = videoFactory2.getVideo();
        video2.produce();



    }


}
