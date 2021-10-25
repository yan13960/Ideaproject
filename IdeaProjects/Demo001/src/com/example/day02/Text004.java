package com.example.day02;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        int shirtPrice=245;
        int shoePrice=570;
        int padPrice=320;
        int shirtNo=2;
        int shoeNo=1;
        int padNo=1;
        double disCount=0.8;
        double finaPay=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*0.8;
        double returnMoney=1500-finaPay;
        int score=(int)finaPay/100*3;
        System.out.println("***********“消费单”************");
        System.out.println("购买物品\t"+"单价\t"+"个数\t"+"金额");
        System.out.println("T恤\t\t\t"+"￥"+shirtPrice+"\t"+shirtNo+"\t"+"￥"+shirtPrice*shirtNo);
        System.out.println("网球拍\t\t"+"￥"+shoePrice+"\t"+shoeNo+"\t"+"￥"+shoePrice*shoeNo);
        System.out.println("网球拍\t\t"+"￥"+padPrice+"\t"+padNo+"\t"+"￥"+padPrice*padNo+"\n");
        System.out.println("折扣\t\t  8折");
        System.out.println("消费总金额\t"+"￥"+finaPay);
        System.out.println("实际交费\t"+"￥"+1500);
        System.out.println("找钱\t\t"+"￥"+returnMoney);
        System.out.println("本次购物所获的积分是：\t"+score);
    }
}
