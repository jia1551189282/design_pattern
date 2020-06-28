package com.jia.design.pattern.creational.prototype.v3_deepclone;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:44
 */

import java.io.*;

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

    /**
     * 深克隆处理方式1：
     *      引用类型也用克隆来处理
     *      存在问题：
     *          如果引用类型过多的话，需要处理的过程就比较多了
     * @return
     */
    /*@Override
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
    }*/

    /**
     * 处理方法2 :
     *      用序列化的方式来处理
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone()  {
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null ;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null ;

        try{
            // 序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            Sheep sheep = (Sheep) ois.readObject();
            return  sheep ;
        }catch (Exception e){
            e.printStackTrace();
            return  null;

        }finally {
            try{
                ois.close();
                bis.close();
                oos.close();
                bos.close();
            }catch (Exception e1){
                e1.printStackTrace();
            }
        }
    }
}
