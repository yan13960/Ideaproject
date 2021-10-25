package com.example.day14.d;

/**
 *
 */
public class Penguin extends Pet {
    private String sex;


    /**
     * 系统默认给我们生成的是这样子的代码
     * super 在构造方法只能是第一位
     */
    public Penguin() {
        //super();//调用父类构造方法
        System.out.println("2");
    }


   /* public   Penguin(String sex ){
        System.out.println("有参的构造方法");
    }*/
}