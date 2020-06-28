package com.jia.design.pattern.creational.prototype.v3_deepclone;

/**
 * @author ZJJ
 * @date 2020/6/28 0028 上午 10:54
 */
public class Client {
    public static void main(String[] args) {
        Sheep tom = new Sheep("tom","白色",3);
        Person person = new Person("susu",22);
        tom.setFriend(person);

        Sheep sheepClone = (Sheep) tom.clone();
        System.out.println(sheepClone);
        System.out.println(tom);

    }
}
