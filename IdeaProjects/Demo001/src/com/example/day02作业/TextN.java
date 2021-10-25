package com.example.day02作业;

import java.util.Scanner;

public class TextN {
    public static void main(String[] args) {
        Scanner VipCard = new Scanner(System.in);
        System.out.println("请输入四位会员卡号");
        int x = VipCard.nextInt();
        int a = x / 1000;/*千位*/
        int b = x / 100 % 10;//百位
        int c = x / 10 % 10;//十位
        int d = x % 10;//个位
        int e = a + b + c + d;
        if (e == 28) {
            System.out.println(x+ "号是幸运客户");
        } else{
            System.out.println( x+ "号不是幸运客户");
    }
        }
    }

