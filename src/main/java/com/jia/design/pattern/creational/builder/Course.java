package com.jia.design.pattern.creational.builder;

/**
 * @author ZJJ
 * @date 2020/6/15 0015 上午 10:05
 */

/**
 * 课程实体类
 */
public class Course {
    /**
     * 课程名称
     */
    private String  courseName;
    /**
     * 课程PPT
     */
    private String  coursePPT;
    /**
     * 课程视频
     */
    private String  courseVideo;
    /**
     * 课程手记
     */
    private String  courseArticle;
    /**
     *  Question &&　Answer
     */
    private String  courseQA;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCoursePPT() {
        return coursePPT;
    }

    public void setCoursePPT(String coursePPT) {
        this.coursePPT = coursePPT;
    }

    public String getCourseVideo() {
        return courseVideo;
    }

    public void setCourseVideo(String courseVideo) {
        this.courseVideo = courseVideo;
    }

    public String getCourseArticle() {
        return courseArticle;
    }

    public void setCourseArticle(String courseArticle) {
        this.courseArticle = courseArticle;
    }

    public String getCourseQA() {
        return courseQA;
    }

    public void setCourseQA(String courseQA) {
        this.courseQA = courseQA;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
