package com.example.day08作业;

import java.util.Scanner;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("MyShopping管理系统>客户信息管理>添加客户信息");
        int vipCard = 0;
        String vipBirthday = "";
        int jiFen = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("请输入会员号四位整数：");
            vipCard = input.nextInt();
            if (vipCard >= 100 && vipCard <= 9999) {
                System.out.print("请输入会员生日(月/日<用两位整数表示>)：");
                vipBirthday = input.next();
                System.out.print("请输入会员积分：");
                jiFen=input.nextInt();
                System.out.println("你录入的会员信息是：");
                System.out.println(vipCard + "\t" + vipBirthday + "\t" + jiFen);
            } else {
                System.out.println("输入错误，请重新输入");
            }
        }
        System.out.println("程序结束，谢谢你的使用");
    }
}
