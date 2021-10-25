package com.example.day05;

/**
 *
 */
public class Text009 {
    public static void main(String[] args) {
       //张成的JavaSe成绩大于80分    并且  mysql  成绩大于  90  奖励 1000元大礼包
       int javaSe=83;
       int mysql=91;
       if (javaSe>85&&mysql>90){
           System.out.println("所以拿不到，有一个不是true");
       }
       if (false&&true&&true){
           System.out.println("只要有一个不是true就不成立");
       }
    }
}
