package com.example.day16.a;

/**
 *
 */
public abstract  class Pet {
    private String name;
    private int love;//与主人亲密度
    private int health;//健康值

    /**
     * 喂食的方法
     */
    public abstract void eat();



    public static void main(String[] args) {
     Pet pet=new Dog();
    }
}
