package com.example.day11.b;

/**
 *
 */
public class Dog {
    //2发现属性
    /**
     * public 公开 公共  后面课程会重点讲修饰符
     * String(变量类型) name（变量名，随便取）
     * ="昵称" 赋的值
     */
    public String name="昵称1";
    public String strain="品种";
    public int love=100;//主人的亲密度
    //。。还有很多很多
    /**
     *  3.发现行为
     *  目前大家就这样写，等会就会讲到，现在不讲
     *  这个就是方法，后面重点讲
     */
    public void  sleep(){
        System.out.println("睡");
    }
    public void eat(){
        System.out.println("吃");
    }
}
