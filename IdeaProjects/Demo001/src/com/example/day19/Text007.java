package com.example.day19;

import com.example.day14作业.c.Dog;
import com.example.day14作业.c.Penguin;
import com.example.day14作业.c.Pet;

/**
 *
 */
public class Text007 {
    public static void main(String[] args) {
       // java.lang.ArithmeticException: / by zero
        //int i = 10 / 0;
      // String str[] = {"a", "b", "c"};
       // System.out.println(str[2]);
        //java.lang.ArrayIndexOutOfBoundsException: 3
        /*String str2=null;
        java.lang.NullPointerException
        System.out.println(str2.toString());*/

        //Pet pet = new Dog();
        //java.lang.ClassCastException 类转换异常
        // Penguin  penguin =(Penguin) pet;
        //以后在开发过程中，使用servlet 前端传送到后面的，都是字符串（不管你是数据也好）
        String numStr="123B";
        //通过这一句话把字符串（数字） 转为int
        Integer num=Integer.parseInt(numStr);//java.lang.NumberFormatException: For input string: "123B"
        System.out.println(num);
    }
}
