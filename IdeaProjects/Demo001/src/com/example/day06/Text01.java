package com.example.day06;

/**
 *
 */
public class Text01 {
    public static void main(String[] args) {
        /**
         *  张三的javaSe 成绩大于90分   并且  mysql 成绩大于  80 就奖励 电脑
         *  或 张三的javaSe 成绩等于100    并且  mysql 成绩大于  60 就奖励 电脑
         */
        int javaSe=99;
        int mysql=81;
       /* if(javaSe>90 &&  mysql>80){
            System.out.println("不能");
        }

        if(javaSe==100  && mysql>60){
            System.out.println("成立");
        }*/

        //  ^  开发没有人写
        //(javaSe>90 &&  mysql>80)  ||  (javaSe==100  && mysql>60)
        if((javaSe>90 &&  mysql>=80)  ||   (javaSe==100  && mysql>60)){
            System.out.println("奖励 电脑 一台");
        }
    }
}
