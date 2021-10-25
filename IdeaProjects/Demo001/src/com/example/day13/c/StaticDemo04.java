package com.example.day13.c;
/**
 * 所有方法中，都不能定义 static修饰的属性
 */
public class StaticDemo04 {
    //普通属性
    public  int a=10;
    //静态属性
    public static int b=20;

    public void getA(){
        System.out.println("这是普通方法");
        System.out.println(a);
        System.out.println(b);

        //int aa=100;可以
       // static int b=200; 不可以  这个是笔记题如果考基础，就会有
    }
    public static void getB(){
        System.out.println("静态方法");
        //System.out.println(a);static修饰的，不能访问非static修饰的
        System.out.println(b);
    }
    public void getC(){
        getA();
        getB();//普通方法可以调用普通方法，也可以调用静态方法
    }
    public static void getD(){
       // getA;
        getB();//静态方法只能调用静态方法
    }
}
