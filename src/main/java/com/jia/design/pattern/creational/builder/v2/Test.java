package com.jia.design.pattern.creational.builder.v2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author ZJJ
 * @date 2020/6/15 0015 上午 10:32
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().builderCourseArticle("java设计模式手记")
                .builderCourseName("java设计模式").builderCoursePPT("java设计模式ppt")
                .builderCourseQA("java设计模式QA").makeCourse();
        System.out.println(course);
    }



}
