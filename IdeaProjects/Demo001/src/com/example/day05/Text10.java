package com.example.day05;

/**
 *
 */
public class Text10 {
    public static void main(String[] args) {
        //张成的javaSe 成绩大于90分    或者  mysql 成绩大于  80 就奖励 电脑
        //意思 就是一个成立就有奖励
        int javaSe=89;
        int mysql=88;
        System.out.println(javaSe>90);//false
        System.out.println(mysql>80);//true
        if (false||true||false) {//只要有一个true就运行
            System.out.println("就是一个成立就要奖励1");
        }
        if (javaSe>90||mysql>80){
            System.out.println("就是一个成立就有奖励2");
        }
    }
}
