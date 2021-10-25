package com.example.day14作业.e;

/**
 *
 */
public class Dog  extends Pet{
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
    public void run(){
        super.run();
        System.out.println(super.getName());
        System.out.println(this.getName());

    }
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.setName("666");
        dog.run();
    }
}
