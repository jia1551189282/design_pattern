package com.jia.design.pattern.creational.prototype.v2;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:32
 */

/**
 * 客户端
 */
public class Client {

    public static void main(String[] args) {
        Sheep tom = new Sheep("tom","白色",5);
        Sheep dolly = new Sheep("dolly","彩色",6);
        tom.setFriend(dolly);

        Sheep sheep1 =(Sheep) tom.clone();
        System.out.println(sheep1);

        System.out.println(tom.getFriend().hashCode());
        System.out.println(sheep1.getFriend().hashCode());



    }
}
