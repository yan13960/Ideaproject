package com.example.day14作业.c;

/**
 *
 */
public class Dog extends Pet{

    public void run(){
        this.name="欧欧";
        this.love=100;
        super.run();
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.run();
        Penguin penguin=new Penguin();
        penguin.run();
    }
}
