package com.example.day15.c;

/**
 *
 */
public class Student extends Tutor{
    public String s_name="p3";
    public Student(){

    }
    public Student(String sbq){
        super("c3");//如果这里报错错，也要检查父类的构造方法
        System.out.println("我是Student3");
    }
}
