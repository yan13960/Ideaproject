package com.example.day15.e;

/**
 * 学生继承 Tutor
 */
public class Student extends Tutor {

    public   String s_name="p3";
    // Student student = new Student("p1","t2","s3");
    public  Student(String p_name,String t_name,String s_name){
        super(p_name,t_name);//如果这里报错错，也要检查父类的构造方法
        System.out.println("我是"+s_name);

    }
}