package com.example.day08作业;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        int num=1;
        int sum=0;
        while (num<=100){
            sum=sum+num;
           num=num+2;
        }
        System.out.println("100以内的奇数之和为："+sum);
    }
}
