package com.jia.design.pattern.creational.builder;

/**
 * @author ZJJ
 * @date 2020/6/15 0015 上午 10:28
 */
public class Test {
    public static void main(String[] args) {
        Coach coach = new Coach();
        CourseBuilder courseBuilder = new CourseActualBuilder();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("java设计模式", "java设计模式PPT", "java设计模式视频",
                "java设计模式手记", "java设计模式QA");

        System.out.println(course);

        


    }
}
