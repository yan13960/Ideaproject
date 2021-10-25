package com.example.day06;

/**
 *
 */
public class Text08 {
    public static void main(String[] args) {
        /**
         * 如果 10秒内 的可以进入 决赛
         *   进入 决赛 之后再分  男子队   女子队
         */
        int num=9;
        String sex="女";
        if (num<10){
            if ("女".equals(sex)){
                System.out.println("进入女子队");
            }else{
                System.out.println("进入男子队");
            }
            }else{
            System.out.println("退出比赛");
        }
    }
}
