package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/3 20:47
 */
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
    }

    /**
     * 多态的思想  但是会对子类产生依赖
     */
    public static void  test1(){
        Video video = new JavaVideo();
        video.produce();
    }

    public static void test2(){
        VideoFactory videoFactory = new VideoFactory();
        Video video = videoFactory.getVideo("java");
    }

    public static void test3(){
        VideoFactory videoFactory = new VideoFactory();
        videoFactory.getVideo2(JavaVideo.class);
    }
}
