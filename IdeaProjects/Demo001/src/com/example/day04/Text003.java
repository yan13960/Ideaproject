package com.example.day04;

import java.util.Scanner;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        //可以接受我们输入的值
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入好人的JavaSe成绩");
        double javaSe = sc.nextDouble();

        System.out.println("请输入好人的JavaWeb成绩");
        double javaWeb =sc.nextDouble();

        System.out.println("请输入好人的MySQL成绩");
        double MySql =sc.nextDouble();

        System.out.println("==========================");
        System.out.println("\t JavaSe \t javaweb\t mysql");
        System.out.println("\t\t"+javaSe+"\t\t"+javaWeb+"\t"+MySql);
        System.out.println("===========================");
        System.out.println("javaSe与mysql数据成绩差为"+(javaSe-MySql));
        double avg=(javaSe+MySql+javaWeb)/3;
        System.out.println("平均分为："+avg);
    }
}
