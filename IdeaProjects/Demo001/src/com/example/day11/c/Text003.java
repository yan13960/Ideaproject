package com.example.day11.c;

import com.example.day11.b.Dog;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
       // 需要拿到Dog类中的一些信息，必需创建对象
        // 创建对象 实例化  new()对象，一个意思
        /**
         *  Dog(必需与类名一致)  sbqsbq =  new Dog();
         * dog 变量名
         */
        Dog dog=new Dog();
        //获取 Dog 类中的 name值    变量名sbqsbq.属性名
        System.out.println(dog.name);
    dog.name="修改的值2";
        System.out.println(dog.name);
    }
}
