package com.xinzhi.xml;

/**
 *
 */
public class Student {
    private  String name;
    private int age;
    private String gander;

    public Student() {
    }

    public Student(String name, int age, String gander) {
        this.name = name;
        this.age = age;
        this.gander = gander;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gander='" + gander + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGander() {
        return gander;
    }

    public void setGander(String gander) {
        this.gander = gander;
    }
}
