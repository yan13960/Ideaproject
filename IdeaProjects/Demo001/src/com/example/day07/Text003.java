package com.example.day07;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        /**
         * 张三
         * 参加编程比赛
         *  第一名  笔记本电脑一台
         *  第二名  手机一部
         *  第三名   移动硬盘
         *  否则  什么也没有
         *   使用  switch 结构
         *   这是标准写法
         *   如果 全部有 break; 就在最后一位
         *   大家记住，程序是要自己去运行的，看结果   这个不用太深入
         *   写程序还是那句话，要自己动手写出来，运行看结果。
         *   讲这个只是笔记题目有可能有，不会太多。
         *   开发如果写，都会按照标准去写， 都会加  break  default 都会放最后面
         */
        int num =1;
        switch (num){
            case 2:
                System.out.println("笔记本电脑一台1");
                break;
            case 1:
                System.out.println("手机一部2");
                // break;
            default:
                System.out.println("什么也没有5");
                // break;
            case 3:
                System.out.println("移动硬盘3");
                //break;
            case 4:
                System.out.println("4");
                break;
        }

        System.out.println("能不能输出6 ");
    }
    }

