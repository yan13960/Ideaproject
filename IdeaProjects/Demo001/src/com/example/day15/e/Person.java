package com.example.day15.e;

/**
 *
 */
public class Person extends Object{
    //为了好测试，我直接使用public
    public   String p_name="p1";
    //super(p_name);
    public  Person(String p_name){
        super();
        this.p_name=p_name;//p4赋值给了this。。。
        System.out.println("我是"+this.p_name);
    }
}
