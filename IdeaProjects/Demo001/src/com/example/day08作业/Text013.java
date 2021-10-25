package com.example.day08作业;

import java.util.Scanner;

/**
 *
 */
public class Text013 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 3;
        for (int i = 0; i <3; i++) {
            System.out.print("请输入用户名：");
            String name = input.next();
            System.out.print("请输入密码：");
            String passord = input.next();
            if (!"jim".equals(name) && !"123456".equals(passord)) {
                num--;
                System.out.println("输入错误，你还有" + num + "次机会");
               continue;
            } else {
                System.out.println("欢迎登录myshopping购物系统！");
                break;
            }
        }
        if (num==0){
            System.out.println("对不起，您3次均输入错误");
        }
    }
}