package com.example.day04;

import java.util.Scanner;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {

        //只是数字判断 是否相等必需用==  如果是字符串大家直接使用
        System.out.println("aa" == "aa");

        /**
         *  在讲后面OOP课会画内存图大家就懂了,目前只需要知道一点，
         *  记住就好，以后开发只要是字符串比较 直接用equals  以后还会经常写
         */

        Scanner sbqSbq = new Scanner(System.in);
        String str = "aa";
        System.out.println("请输入我们的值");
        String str2 = sbqSbq.next();
        System.out.println(str == str2);//==不能比较字符串要用eqval

        System.out.println(str.equals(str2));//true

        System.out.println("aa".equals(str2));//true

        System.out.println(str2.equals(str));//true

        System.out.println(str2.equals("aa"));//true
    }
}
