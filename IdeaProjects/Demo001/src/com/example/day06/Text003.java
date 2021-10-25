package com.example.day06;

import java.util.Scanner;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        Scanner str=new Scanner(System.in);
        System.out.println("请输入体彩信息");
        String str1=str.next();
        if (str1.equals("500万")) {
            System.out.println("买车");
        }else
            System.out.println("不买车");
    }
}
