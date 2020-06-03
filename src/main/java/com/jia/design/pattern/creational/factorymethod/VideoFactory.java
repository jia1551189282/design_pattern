package com.jia.design.pattern.creational.factorymethod;

/**
 * @author : zjj
 * @date : 2020/6/3 20:52
 */
public class VideoFactory {
    // 方式一 通过简单类型传入，工厂从而确定来创建什么课程
    // 但是要加入新的课程就要改工厂方法
    public Video getVideo(String type){
        if("java".equals(type)){
            return new JavaVideo();
        }else if("python".equals(type)){
            return new PythonVideo();
        }
        return null;
    }

    // 方式二  对方式一进行优化
    // 可以把需要创建类型传入 ，反射来创建
    public Video getVideo2(Class clazz){
        Video video = null;
        try {
            video = (Video) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
