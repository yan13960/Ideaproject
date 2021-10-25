package com.example.day14.a;

public class Text01{
    public static void main(String[] args) {
        Dog dog = new Dog();
       /* dog.health=-1000;
        System.out.println(dog.health);*/
        //System.out.println(dog.name);

        /*dog.setName("我赋值的");
        String sbq= dog.getName();
        System.out.println(sbq);*/

        dog.setHealth(100);
        System.out.println(dog.getHealth());
    }
}