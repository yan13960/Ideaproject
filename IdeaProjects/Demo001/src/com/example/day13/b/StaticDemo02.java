package com.example.day13.b;

//这才是我们开发过程会用到的

/**
 * static 修饰的方法，我们称之为工具方法 类型于 Math.random()
 */
public class StaticDemo02 {
    //普通属性
    public String str1="a";
    //静常属性
    public static String str2="b";

    //普通方法
    public void getA(){
        System.out.println("普通方法");
    }
    //静态方法
    public static void getB(){
        System.out.println("静态方法");
    }
}
