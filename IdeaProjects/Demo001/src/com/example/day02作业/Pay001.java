package com.example.day02作业;

public class Pay001 {
    public static void main(String[] args) {
        int shirtPrice = 245; //Ｔ恤价格
        int shoePrice = 570;  //网球鞋价格
        int padPrice = 320;   //网球拍价格
        int shirtNo=2;        //Ｔ恤件数
        int shoeNo =1;        //运动鞋数目
        int padNo = 1;        //网球拍数目
        double discount = 0.8;

        /*计算消费总金额*/
        double finalPay = (shirtPrice * shirtNo + shoePrice * shoeNo + padPrice * padNo) * discount;
        System.out.println("消费总金额：" + finalPay);
        /*计算找钱*/
        double returnMoney = 1500-finalPay;

        /*打印购物小票*/
        System.out.println("＊＊＊＊＊＊＊*消费单*＊＊＊＊＊＊＊");
        System.out.println("购买物品\t" + "单价\t" + "个数\t"+ "金额\t");
        System.out.println("Ｔ恤\t" + "￥"+shirtPrice+ "\t"  + shirtNo+ "\t" + "￥"+(shirtPrice * shirtNo)+"\t");
        System.out.println("网球鞋\t" + "￥"+shoePrice + "\t"+ shoeNo+ "\t" + "￥"+(shoePrice * shoeNo)+ "\t");
        System.out.println("网球拍\t" + "￥"+padPrice + "\t"+ padNo+ "\t" + "￥"+(padPrice * padNo)+ "\t\n");
        System.out.println("折扣：\t8折");
        System.out.println("消费总金额\t" + "￥" + finalPay);
        System.out.println("实际交费\t￥1500");
        System.out.println("找钱\t" + "￥" + returnMoney);

        /*计算本次购物所获积分*/
        int score =  (int)finalPay / 100 * 3; //强制类型转换
        System.out.println("本次购物所获的积分是： " + score);
    }
}
