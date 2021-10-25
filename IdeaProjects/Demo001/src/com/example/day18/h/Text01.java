package com.example.day18.h;

import java.util.Scanner;

/**
 *
 */
public class Text01 {
    //这是我运行的时候出出的异常
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = in.nextInt();
        System.out.print("请输入除数:");
        int num2 = in.nextInt();
        System.out.println(String.format("%d / %d = %d",
                num1, num2, num1/ num2));//这句代码开发100% 不写大家复制就好了
        System.out.println("感谢使用本程序！");
    }
}
