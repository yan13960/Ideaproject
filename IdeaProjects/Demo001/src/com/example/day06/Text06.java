package com.example.day06;

/**
 *
 */
public class Text06 {
    public static void main(String[] args) {
        //我需要根据不同的条件，赋值
        int num=0;
        int money=20;
        if (money>100){
            num=100;
            System.out.println("买一辆BMW");
        }else if (money>60){
            num=60;
            System.out.println("买一辆卡迪拉克");
        }else if (money>30){
            num=30;
            System.out.println("买一辆大众");
        }else {
            System.out.println("买一辆自行车");
        }
    }
}
