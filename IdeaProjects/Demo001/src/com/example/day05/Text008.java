package com.example.day05;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {
        //张成的javaSe成绩大于80分 并且 mysql成绩大于90 奖励 1000元大礼包
        int javaSe = 83;
        int mysql = 88;
        System.out.println(javaSe > 80);//true
        System.out.println(mysql > 90);//false
        //只是一门成绩达到了条件，并不是两门成绩，所以拿不到 1000元大礼包
        //&& 并
        if (true && true) {
            System.out.println("奖励1000元大礼包");
        }
        if (true && false) {
            System.out.println("所以拿不到，有一个不是true");
        }
        if (javaSe>80&&mysql>90) {
            System.out.println("所以拿不到，有一个不是true");
        }
    }
}
