package com.example.day06作业;

import java.util.Scanner;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        int age=SC.nextInt();
        if (age>=70){
            System.out.println("安乐死");
        }else if (age>=50){
            System.out.println("到处浪");
        }else if (age>=30){
            System.out.println("结婚生娃");
        }else if (age>=18){
            System.out.println("爱干嘛干嘛");
        }else
            System.out.println("听妈妈的话");
    }
}
