package com.example.day16.b;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        Master master=new Master();
        Pet pet=new Dog();
        master.feed(pet);
        Dog dog=new Dog();
        master.feed(dog);
        master.feed(new Dog());


        master.feed(new Penguin());

        Pet pet1=new Penguin();
        master.feed(pet1);

    }
}
