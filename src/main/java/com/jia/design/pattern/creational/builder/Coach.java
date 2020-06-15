package com.jia.design.pattern.creational.builder;

/**
 * @author ZJJ
 * @date 2020/6/15 0015 上午 10:23
 */

/**
 * 教练实体类
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    /**
     * 教练 对接课程
     * @param courseName
     * @param coursePPT
     * @param courseVideo
     * @param courseArticle
     * @param courseQA
     * @return
     */
    public Course makeCourse(String courseName,String coursePPT,String courseVideo,
                           String courseArticle,String courseQA){
        this.courseBuilder.builderCourseName(courseName);
        this.courseBuilder.builderCourseArticle(courseArticle);
        this.courseBuilder.builderCoursePPT(coursePPT);
        this.courseBuilder.builderCourseVideo(courseVideo);
        this.courseBuilder.builderCourseQA(courseQA);

        Course course = courseBuilder.makeCourse();
        return course;
    }

}
