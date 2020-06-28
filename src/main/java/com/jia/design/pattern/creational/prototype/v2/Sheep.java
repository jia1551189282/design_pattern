package com.jia.design.pattern.creational.prototype.v2;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:30
 */
/**
 * 方式1 存在的问题:
 *      简单数据类型的克隆可以成功，引用类型的克隆只是单纯将引用赋值到原来的变量
 *      这样一旦原始的对象的引用类型发生了变化，克隆的对象也会变化。会引发很多问题。
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
    /**
     * 朋友
     */
    private Sheep friend;

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

    public Sheep getFriend() {
        return friend;
    }

    public void setFriend(Sheep friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "username='" + username + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", friend=" + friend +
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
