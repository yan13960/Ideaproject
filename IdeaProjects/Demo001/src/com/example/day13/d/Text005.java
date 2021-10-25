package com.example.day13.d;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        String sbq=dog.getA();
        System.out.println(sbq);
        dog.setA("aa1");
        //请问这句输出什么
        System.out.println(dog.getA());
    }
}
