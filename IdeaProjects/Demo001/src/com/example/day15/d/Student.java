package com.example.day15.d;

/**
 *
 */
public class Student extends Tutor{
    public String s_name="p3";
    public Student(String P_name,String t_name,String s_name){
        super(P_name,t_name);//如果这里报错错，也要检查父类的构造方法
       // System.out.println("我是Student3");
    }
}
