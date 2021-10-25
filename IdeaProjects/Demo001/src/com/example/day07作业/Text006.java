package com.example.day07作业;

import java.util.Scanner;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        System.out.println("\t\t\t欢迎使用我行我素购物管理系统\n");
        System.out.println("\t\t\t\t\t1、登录系统\n");
        System.out.println("\t\t\t\t\t2、退出\n");
        System.out.println("************************************************\n");
        System.out.print("请输入，输入数字：");
        Scanner inPut1=new Scanner(System.in);
        int num1=inPut1.nextInt();
       if (num1==1) {
           System.out.println("主菜单：");
           System.out.println("1、客户信息管理");
           System.out.println("2、购物结算");
           System.out.println("3、真情回馈");
           System.out.println("4、注销");
           Scanner inPut2 = new Scanner(System.in);
           int num2 = inPut2.nextInt();
           switch (num2) {
               case 1:
                   System.out.println("购物管理系统>客户信息管理");
                   System.out.println("1、显示所有客户信息");
                   System.out.println("2、添加客户信息");
                   System.out.println("3、修改客户信息");
                   System.out.println("4、查询客户信息");
                   break;
               case 3:
                   System.out.println("购物管理系统>真情回馈");
                   System.out.println("1、幸运大放送");
                   System.out.println("2、幸运抽奖");
                   System.out.println("3、生日问候");
                   break;
               default:
                   System.out.println("****************************************");
                   break;
           }
       }else {
           System.out.println("谢谢你的使用");
       }
    }
}

