package com.example.day23作业;

/**
 *
 */
public class Person extends Pig {
private int id;

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public Person(int id) {
        super(5);
this.id=id;
        System.out.println(this.getId());
        System.out.println(super.getId());
        System.out.println(this.id);
    }

    public static void main(String[] args) {
        Person person=new Person(555);
    }
}
