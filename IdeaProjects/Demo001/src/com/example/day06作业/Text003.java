package com.example.day06作业;

import java.util.Scanner;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统>客户信息管理>添加客户信息\n");
        Scanner inPut = new Scanner(System.in);
        int vipCard = inPut.nextInt();
        Scanner inPut1 = new Scanner(System.in);
        int yue = inPut1.nextInt();
        Scanner inPut2 = new Scanner(System.in);
        int ri = inPut2.nextInt();
        if (vipCard>=1000&&vipCard<10000) {
            System.out.println("请输入会员号(<4位整数>):" + vipCard);
            System.out.println("请输入会员生日(月/日<用两位数表示>)" + yue + "/" + ri);
            System.out.println("请输入积分:1000\n");
            System.out.println("已录入的会员信息是:\n" + vipCard + "\t" + yue + "/" + ri + "\t" + "1000");
        } else {
            System.out.println("会员卡号错误，请重新输入");
        }
    }
}
