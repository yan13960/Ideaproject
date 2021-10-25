package com.example.day24.b;

/**
 *
 */
public class Pet extends Dog {
    public Pet(String name) {
        super(name);
    }

    public Pet() {
        //super("111");
        this("aaa");
    }

    public static void main(String[] args) {
        Pet pet=new Pet();
    }
}
