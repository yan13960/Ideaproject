package com.example.day08;

import java.util.Scanner;

/**
 *
 */
public class Text011 {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        System.out.print("请输入消费金额：");
        double price=inPut.nextDouble();
        System.out.print("是否参加优惠换购活动：");
        String str=inPut.next();
        if ("y".equals(str)){
            System.out.println("1:满50元，加2元换购百事可乐饮料一瓶");
            System.out.println("2:满100元，加3元换购500ml可乐一瓶");
            System.out.println("3:满100元，加10元换购5公斤面粉");
            System.out.println("4:满200元，加10元可换购1个苏泊尔炒菜锅");
            System.out.println("5:满200元，加20元可换购欧莱雅爽肤水一瓶");
        }else{
            System.out.println("不换购");
        }
        System.out.print("请选择：");
        int no=inPut.nextInt();
        switch (no){
            case 1:
                if (price>=50){
                    System.out.println("本次消费总金额："+(price+2));
                    System.out.println("成功换购：一瓶百事可乐");
                }else {
                    System.out.println("消费不足，无法换购");
                    break;
                }
            case 2:
                if (price>=100){
                    System.out.println("本次消费总金额："+(price+3));
                    System.out.println("成功换购：500ml可乐一瓶");
                }else {
                    System.out.println("消费不足，无法换购");
                    break;
                }
            case 3:
                if (price>=100){
                    System.out.println("本次消费总金额："+(price+10));
                    System.out.println("成功换购：5公斤面粉");
                }else {
                    System.out.println("消费不足，无法换购");
                    break;
                }
            case 4:
                if (price>=200){
                    System.out.println("本次消费总金额："+(price+10));
                    System.out.println("成功换购：一个苏泊尔炒菜锅");
                }else {
                    System.out.println("消费不足，无法换购");
                    break;
                }
            case 5:
                if (price>=200){
                    System.out.println("本次消费总金额："+(price+20));
                    System.out.println("成功换购：一瓶欧莱雅爽肤水");
                }else {
                    System.out.println("消费不足，无法换购");
                    break;
                }
            default:
                System.out.println("不换购");
                break;
        }
    }
}
