package com.jia.design.pattern.creational.prototype.v3_deepclone;

import java.io.Serializable;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:45
 */

public class Person implements Cloneable, Serializable {
    private String username;
    private Integer age;


    public Person(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
