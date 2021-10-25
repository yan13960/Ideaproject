package com.example.day14.d;

/**
 *
 */
public class Pig extends Pet {
    /**
     * 我如果要再创建一个新的飞的方法也可以，但我不想创建
     *
     * 重写，
     * 1.直接把父类的方法复制过即可，不能修改返回值
     * super 是超级父类，在哪个类，就是哪个类的爸（父）
     *  现在的  super代表 是  Pet
     *  1.super 只能在子类的方法和构造方法中
     *  2.super不能访问父类的private 修饰的方法与属性
     *  3.静态方法中不能使用super 和this关键字
     *  4.super关键字在构造方法中，能只能在第一位
     */

   /* public void run(){//这是普通方法
        super.run();
        //我修改为我自己的代码
        System.out.println("飞起来了");
        super.run();


    }*/

   /* public  static    void ccc(){
        super.run();
        //静态方法中不能使用super 和this关键字
    }*/

    @Override
    public void run(){
        //System.out.println("跑呀跑");
        //我修改为我自己的代码

        System.out.println("飞起来了");

        //System.out.println("跑呀跑");
    }
    }

