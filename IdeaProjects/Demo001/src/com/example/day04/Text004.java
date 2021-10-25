package com.example.day04;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        //求商 取余数  以后在讲分页开发，会使用到，以后还会讲 ,到了后面我们100%懂了
        //  %          5/2=1     6/3=0   11/2=1
        int num=5%2;
        System.out.println(num);
        System.out.println(6%3);
        System.out.println(11%2);
        //48 天 等于 ？周   剩余 ？天
        int day=48;//共48天
        int week=day/7;//求出总共多少周
        int leftDay=day%7;
        System.out.println(day+"天等于"+week+"周剩余"+leftDay+"天");
    }
}
