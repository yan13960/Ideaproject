package com.example.day14.c;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.setName("不知道");
        Penguin penguin=new Penguin();
        penguin.run();
        penguin.setSex("Q妹");
        System.out.println(penguin.getSex());
        Pig pig=new Pig();
        pig.setHealth(100);

    }
}