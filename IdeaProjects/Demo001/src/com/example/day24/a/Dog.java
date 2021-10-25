package com.example.day24.a;

/**
 *
 */
public class Dog implements Animal {
    @Override
    public void shot() {
        System.out.println("汪汪汪");
    }
    public void eat(){
        System.out.println("ssss");
    }

    public static void main(String[] args) {
     Animal animal= new Dog();
     Dog dog=(Dog)animal;
     dog.shot();
     dog.eat();


    }
}
