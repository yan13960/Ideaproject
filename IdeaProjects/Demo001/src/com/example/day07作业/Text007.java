package com.example.day07作业;

import java.util.Scanner;

/**
 *
 */
public class Text007 {
    public static void main(String[] args) {
        String name="";
        double price=0.0;
        int no=0;
        System.out.println("MyShopping管理系统  > 购物结算\n");
        System.out.println("*******************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T 恤        2.网球鞋        3.网球拍");
        System.out.println("*******************************************");
        Scanner input=new Scanner(System.in);
        String str="y";
        while ("y".equals(str)){
            System.out.println("请输入商品编号：");
            no=input.nextInt();
            switch (no){
                case 1:
                    name="T恤";
                    price=price+245;
                    System.out.println(name+"\t\t"+"￥"+price);
                    break;
                case 2:
                    name="网球鞋";
                    price=price+200;
                    System.out.println(name+"\t\t"+"￥"+price);
                    break;
                case 3:
                    name="网球拍";
                    price=price+280;
                    System.out.println(name+"\t\t"+"￥"+price);
                    break;
            }
            System.out.println("是否继续：(y/n)");
            str=input.next();
        }
        System.out.println("程序结束：");
    }
}
