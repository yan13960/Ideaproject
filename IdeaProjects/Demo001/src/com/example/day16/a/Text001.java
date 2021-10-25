package com.example.day16.a;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        //创建主人类对象new对象
        Master master=new Master();

        Dog sbqDog=new Dog();
        //sbqDog.eat();
        master.feed(sbqDog);

        Penguin penguin=new Penguin();
        master.feed(new Penguin());


    }
}
