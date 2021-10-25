package com.example.day06;

import java.util.Scanner;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        Scanner inPut=new Scanner(System.in);
        String str=inPut.next();
        System.out.println("请输入是否是会员");
        if (str.equals("vip")){
            System.out.println("是");
        }else{
            System.out.println("否");
        }
        Scanner price=new Scanner(System.in);
        System.out.println("请输入购物金额");
        double store=price.nextDouble();
        if (!str.equals("vip")){
            if (store<100) {
                System.out.println("实际支付" + store);
            }else{
                System.out.println("实际支付" +store*0.9);
            }
        }else {
            if (store >= 200) {
                System.out.println("实际支付" + store * 0.75);
            } else {
                System.out.println("实际支付" + store * 0.8);
            }
        }
    }
}

