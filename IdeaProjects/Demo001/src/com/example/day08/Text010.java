package com.example.day08;

import java.util.Scanner;

/**
 *
 */
public class Text010 {
    public static void main(String[] args) {
        String str=" ";
        int no=0;
        double price=0.0;
        System.out.println("MyShopping管理系统  > 购物结算\n");
        //商品清单
        System.out.println("*******************************************");
        System.out.println("请选择购买的商品编号：");
        System.out.println("1.T 恤        2.网球鞋        3.网球拍");
        System.out.println("*******************************************");
        Scanner inPut=new Scanner(System.in);
        String answer="y";
        while ("y".equals(answer)){
            System.out.print("请输入商品编号：");
            no=inPut.nextInt();
            switch (no){
                case 1:
                    System.out.println("T恤\t\t"+"￥"+(price+245));
                    break;
                case 2:
                    System.out.println("网球鞋"+"￥"+(price+380));
                    break;
                case 3:
                    System.out.println("网球拍\t\t"+"￥"+(price+180));
                    break;
            }
            System.out.print("是否继续(y/n)");
            answer=inPut.next();
        }
        System.out.println("程序结束");
    }
}
