package com.example.day16作业.c;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Master master=new Master();
        master.zzz(new Dog());
        master.zzz(new Cat());

        Animal animal=new Cat();
        master.zzz(animal);

        Animal animal1=new Dog();
        master.zzz(animal1);
    }


}
