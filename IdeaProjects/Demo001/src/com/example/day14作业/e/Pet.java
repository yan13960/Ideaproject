package com.example.day14作业.e;

/**
 *
 */
public class Pet {
    private String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run() {

        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Pet pet=new Pet();
        pet.setName("555");
        pet.run();
    }
}
