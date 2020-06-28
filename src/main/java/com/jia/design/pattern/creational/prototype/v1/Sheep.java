package com.jia.design.pattern.creational.prototype.v1;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:16
 */

/**
 * 版本1,简单的实现 原型模式
 */
public class Sheep implements Cloneable{
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
        return "Sheep{" +
                "username='" + username + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null ;
        try{
            sheep = (Sheep) super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
