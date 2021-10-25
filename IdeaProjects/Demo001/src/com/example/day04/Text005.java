package com.example.day04;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        int i=5;
        System.out.println("i第一次值为"+i);
        i++;//相当于 i=i+1；i+5+1；
        System.out.println("i第二次值为"+i);
        i++;
        System.out.println("i第三次值为"+i);
        System.out.println("======================");
        int b=7;
        System.out.println("b第一次值为"+b);
        b--;//相当于b=b-1，b=7-1；
        System.out.println("b第二次值为"+b);
        b--;
        System.out.println("b第三次值为"+b);
        System.out.println("======================");

        int num=8;
        num+=1;//相当于 num=num+1=9//开发会用
        System.out.println("num的值为"+num);
        num+=6;  //9+6
        System.out.println("num的值为"+num);

        int num2=20;
        num2-=4;//20-4=16
        System.out.println(num2);
    }
}
