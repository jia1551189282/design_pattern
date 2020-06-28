package com.jia.design.pattern.creational.prototype;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 9:54
 */

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        Sheep tom = new Sheep("tom","白色",1);

        Sheep sheep1 = new Sheep(tom.getUsername(),tom.getColor(),tom.getAge());
        Sheep sheep2 = new Sheep(tom.getUsername(),tom.getColor(),tom.getAge());
        Sheep sheep3 = new Sheep(tom.getUsername(),tom.getColor(),tom.getAge());
        Sheep sheep4 = new Sheep(tom.getUsername(),tom.getColor(),tom.getAge());
        Sheep sheep5 = new Sheep(tom.getUsername(),tom.getColor(),tom.getAge());

        System.out.println(sheep1 + "\n," + sheep2 + "\n," + sheep3 + "\n," + sheep4 + "\n," + sheep5);
    }
}
