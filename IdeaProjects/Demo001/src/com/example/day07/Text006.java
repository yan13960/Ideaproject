package com.example.day07;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        int num=1;
        switch (num){
            case 1:
                System.out.println("笔记本电脑一台1");
                int num2=60;
                if (num2>60){
                    System.out.println("大于01");
                }else{
                    System.out.println("不大于02");
                }
                break;
            case 2:
                System.out.println("手机一部2");
                break;
            case 3:
                System.out.println("移动硬盘3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("什么也没有5");
                break;
        }
    }
}
