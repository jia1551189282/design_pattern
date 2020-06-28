package com.jia.design.pattern.creational.prototype.v3_deepclone;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:44
 */

import java.io.Serializable;

/**
 * 深克隆的实现
 */
public class Sheep implements Serializable,Cloneable {
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
    /**
     * 朋友
     */
    private Person friend;

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

    public Person getFriend() {
        return friend;
    }

    public void setFriend(Person friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "username='" + username + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", friend=" + friend + ":" + friend.hashCode()+
                '}';
    }

    @Override
    protected Object clone()  {
        Sheep sheep = null ;
        try {
            sheep = (Sheep)super.clone();

            // 引用类型的克隆
            sheep.friend = (Person) friend.clone();

        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return sheep;
    }
}
