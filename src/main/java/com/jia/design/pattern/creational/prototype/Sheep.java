package com.jia.design.pattern.creational.prototype;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 9:49
 */

/**
 * 需求：现在有一只羊，名称tom,年龄为1，白色的羊，需要创建10只属性完全一样的羊
 */
public class Sheep {
    /**
     * 名称
     */
    private String username;
    /**
     * 颜色
     */
    private String color;
    /**
     * 年龄
     */
    private Integer age;

    public Sheep(String username, String color, Integer age) {
        this.username = username;
        this.color = color;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "sheep{" +
                "username='" + username + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
