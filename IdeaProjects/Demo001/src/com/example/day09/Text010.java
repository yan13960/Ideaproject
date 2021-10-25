package com.example.day09;

/**
 *
 */
public class Text010 {
    public static void main(String[] args) {
        //之前都是定义一变量，只能存一个值
        //创建数组  下标从0开始
        int []  arr01 = new  int[5];//默认为0
        /*System.out.println(arr01[0]);
        System.out.println(arr01[1]);
        System.out.println(arr01[2]);
        System.out.println(arr01[3]);
        System.out.println(arr01[4]);*/

        arr01[0]=10;
        System.out.println(arr01[0]);

        arr01[4]=50;
        System.out.println(arr01[4]);
        //会报错，下标越界
        // System.out.println(arr01[5]);




    }
}
