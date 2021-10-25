package com.example.day12.b;

/**
 *
 */
public class Dog {
    //成员变量，在类中的，如果是int（）boolean s=false

    //昵称
    public  String name;//默认值为null
    //品种
    public String strain;
    public int love=100;
    //打印输出的方法
    public void print(){
        System.out.println("宠物的自白：\n 我的名字叫\t"+name+"与主要亲密度\t" +
                ""+love+"品种为"+strain);
    }
}
