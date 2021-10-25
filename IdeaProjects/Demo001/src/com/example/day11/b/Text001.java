package com.example.day11.b;

/**
 *
 */
public class Text001 {
    //我这个代码，写那个类都可以，因为这是一个主入口程序，每个类只能写一个
    public static void main(String[] args) {
        //需要拿到Dog类中的一些信息，必须创建对象
        //创建对象 实例化 new（）对象，一个意思
        /**
         *  Dog(必需与类名一致)  sbqsbq =  new Dog();
         * sbqsbq 变量名
         */
        Dog sbqsbq=new Dog();
        //获取Dog类的中的name值 变量名sbqsbq.属性名
        System.out.println(sbqsbq.name);
       //调用方法//这样写会报错，等会，我会讲这样写不报错
        // System.out.println(sbqsbq.sleep());
        //以后开发都是这样调用的
    }
}
