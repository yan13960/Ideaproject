package com.example.day14作业.b;

/**
 *
 */
public class Dog extends Pet {
    public Dog(String name, int health, int love) {
        super();
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫" + name + "，我的健康值是" + health +
                "我和主人的亲密度是" + love);


    }

    public static void main(String[] args) {
        Penguin penguin=new Penguin("楠楠",100,100);

        Dog dog=new Dog("欧欧",100,100);

    }
}
