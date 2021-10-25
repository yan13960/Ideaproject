package com.example.day12.a;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.getB(1);
        dog.getStr("传一个值过去1");
        System.out.println("这里还是会执行2");
        dog.getStr2(1,"第一个是字符串");
        //dog.getStr2("S",1);//这个报错

        String abcSbq=dog.getStr3("值1","值2");
        System.out.println(abcSbq);
    dog.getA();
    }
}
