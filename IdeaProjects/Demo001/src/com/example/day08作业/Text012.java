package com.example.day08作业;

import java.util.Scanner;

/**
 *
 */
public class Text012 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int persons=input.nextInt();
        int num1=0;
        for (int i=1;i<=persons;i++){
            System.out.print("请输入第"+i+"顾客的年龄:");
        int age=input.nextInt();
        if (age<30){
            continue;
        }num1++;
        }
        double buli1=num1*1.0/persons*100;
        double buli2=(persons-num1)*1.0/persons*100;
        System.out.println("30岁以下的比例是："+buli2+"%");
        System.out.println("30岁以上的比例是："+buli1+"%");

    }

}
