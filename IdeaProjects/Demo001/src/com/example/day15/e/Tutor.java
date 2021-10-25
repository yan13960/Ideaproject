package com.example.day15.e;

/**
 * 导师继承  Person
 */
public class Tutor extends Person {
    public   String t_name="p2";
    //super(p_name,t_name);
    public  Tutor(String p_name,String t_name){
        super(p_name);
        System.out.println("我是"+this. t_name);
    }
}
