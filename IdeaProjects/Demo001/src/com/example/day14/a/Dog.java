package com.example.day14.a;

/**
 * 封装
 * 1 第一步 把public 修改为private 私有的，只有自己能访问
 * 2.第二步 需要提供给外部调用，加上getter /setter方法(就是方法)
 * 3.第二步 在set方法中加入控制语句
 */
public class Dog {
    //2.发现属性
    private   String name;
    public  String strain;
    public  int love;//与主人亲密度
    public  int health;//健康值
    public  boolean flag;
    public  String sex;//这个赋值只能为男或女，大家完成作业


    //private   String name;

    //set方法  就是赋值
    public void  setName( String name){
        this.name=name;
    }
    //get获取值
    public String getName(){
        return name;
    }



    //int health;

    //set
    public  void  setHealth(int health){
        //健康值只能为0-100？  如何操作
        if(health>=0 && health<=100){
            this.health=health;
        }else {
            this.health=0;
        }

    }

    //get
    public  int getHealth(){
        return  health;
    }

}