package com.example.day07作业;

import java.util.Scanner;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        System.out.print("请输入消费金额：");
        Scanner inPut1=new Scanner(System.in);
        double num1=inPut1.nextDouble();
        System.out.print("是否参加换购活动：");
        Scanner inPut2=new Scanner(System.in);
        String str1=inPut2.next();
        if ("是".equals(str1)){
            System.out.print("请选择：");
            Scanner inPut3=new Scanner(System.in);
            int num3=inPut3.nextInt();
            if (num1>=50&&num1<100){
                System.out.println("满50元，加2元换购百事可乐饮料一瓶");
                num1=num1+2;
                System.out.println("本次消费总金额："+num1);
            }else if (num1>=100&&num1<200){
              switch (num3){
                  case 1:
                      System.out.println("满100元，加3元换购500ml可乐一瓶");
                      num1=num1+3;
                      System.out.println("本次消费总金额:"+num1);
                      break;
                  case 2:
                      System.out.println("满100元，加10元换购5公斤面粉");
                      num1=num1+10;
                      System.out.println("本次消费总金额"+num1);
              }
            }else if (num1>=200){
                switch (num3){
                    case 1:
                        System.out.println("满200元，加10元可换购1个苏泊尔炒菜锅");
                        num1=num1+10;
                        System.out.println("本次消费总金额"+num1);
                        break;
                    case 2:
                        System.out.println("满200元，加20元可换购欧莱雅爽肤水一瓶");
                        System.out.println("本次消费总金额"+num1);
                }
            }else{
                System.out.println("不参加换购活动");
            }
        }
    }
}
