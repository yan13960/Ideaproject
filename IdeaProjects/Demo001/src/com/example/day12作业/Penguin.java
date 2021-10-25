package com.example.day12作业;

/**
 *
 */
public class Penguin {
    public String name;//名字
    public int health=100;//健康值
    public int love=100;//亲密度
    public String sex;//性别

    public void print(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫"+name+",健康值是"+health+",和主人的亲密度是"+love+",性别是"
                +sex);

    }
}
