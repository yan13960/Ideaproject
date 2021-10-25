package com.example.day07作业;

import java.util.Scanner;

/**
 *
 */
public class Text005 {
    public static void main(String[] args) {
        System.out.print("请输入消费金额：");
        Scanner inPut1=new Scanner(System.in);
        double num1=inPut1.nextDouble();
        System.out.print("是否参加换购活动：");
        Scanner inPut2=new Scanner(System.in);
        String str1=inPut2.next();
        if ("是".equals(str1)){
            System.out.println("1:满50元，加2元换购百事可乐饮料一瓶");
            System.out.println("2:满100元，加3元换购500ml可乐一瓶");
            System.out.println("3:满100元，加10元换购5公斤面粉");
            System.out.println("4:满200元，加10元可换购1个苏泊尔炒菜锅");
            System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶");
        }else {
            System.out.println("0:不换购");
        }
        System.out.print("请选择：");
        int num3=inPut1.nextInt();
        switch (num3){
            case 1:
                if (num1>=50) {
                    System.out.println("本次消费总金额：" + (num1 + 2));
                    System.out.println("成功换购：百事可乐饮料一瓶");
                }else{
                    System.out.println("消费不足无法换购");
                    break;
                }
            case 2:
                if (num1>=100) {
                    System.out.println("本次消费总金额：" + (num1 + 3));
                    System.out.println("成功换购：500ml可乐一瓶");
                }else {
                    System.out.println("消费不足无法换购");
                    break;
                }
            case 3:
                if (num1>=100) {
                    System.out.println("本次消费总金额：" + (num1 + 10));
                    System.out.println("成功换购：5公斤面粉");
                }else
                    System.out.println("消费不足无法换购");
                break;
            case 4:
                if (num1>=200) {
                    System.out.println("本次消费总金额：" + (num1 + 10));
                    System.out.println("成功换购：一个苏泊尔炒菜锅");
                }else {
                    System.out.println("消费不足无法换购");
                    break;
                }
            case 5:
                if (num1>=200) {
                    System.out.println("本次消费总金额：" + (num1 + 20));
                    System.out.println("成功换购：欧莱雅爽肤水一瓶");
                }else {
                    System.out.println("消费不足无法换购");
                    break;
                }
            default:
                System.out.println("0:不换购");
                break;
        }
    }
}