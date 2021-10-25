package com.example.day13.a;

/**
 * 1 第一步 发现类
 * 2.发现属性
 * 3.发现行为
 */
public class Dog {
    //发现属性
    public String name;
    public String strain;
    public int love;
    public char sex;

    //无参构造方法
    public  Dog(){
        System.out.println("这是无参构造方法1");
    }
    //this就是当前类
    public Dog(String name,String strain,int love,char sex){
        System.out.println(name);
        System.out.println(strain);
        System.out.println(love);
        //这是标准写法
        this.name=name;
        this.strain=strain;//这是标准写法
        this.love=love;//这是标准写法
        this.sex=sex;//这是标准写法
    }
    public Dog(String name,String strain){
        name=name;//这是有问题的
        strain=strain;//这不是标准写法，开发没有人这样写
    }
    //这是标准写法， 不要问我快捷键，我现在不教，大家先自己写，下星期会教
    public Dog(String name, String strain, int love) {
        this.name = name;
        this.strain = strain;
        this.love = love;
    }
}
