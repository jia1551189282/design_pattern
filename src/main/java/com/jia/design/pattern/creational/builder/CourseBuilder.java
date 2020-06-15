package com.jia.design.pattern.creational.builder;

/**
 * @author ZJJ
 * @date 2020/6/15 0015 上午 10:10
 */

/**
 * 课程建造者抽象类
 */
public abstract class CourseBuilder {
    /**
     * 创建课程名称
     * @param courseName
     */
    public abstract void builderCourseName(String courseName);

    public abstract void builderCoursePPT(String coursePPT);

    public abstract void builderCourseVideo(String courseVideo);

    public abstract void builderCourseArticle(String courseArticle);

    public abstract void builderCourseQA(String courseQA);

    public abstract Course makeCourse();

}
