package com.jia.design.pattern.creational.prototype.v1;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:24
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom","白色",1);
        Sheep sheep1 =(Sheep) sheep.clone();
        Sheep sheep2 =(Sheep) sheep.clone();
        System.out.println(sheep1 + "\n," + sheep2 );

    }
}
