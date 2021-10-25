package com.example.day09作业;

import java.util.Scanner;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int c = 0; c < 100; c++) {//代码执行的次数
            System.out.println("请输入一个数字组成一个棱形(输入0，程序结束！)：");
            int sum = scan.nextInt();
            if (sum == 0) {
                System.out.println("程序结束！！");
                break;
            }
            for (int a = 0; a < sum; a++) {
                for (int b = (sum - 1); b > a; b--) {
                    System.out.print(" ");
                }
                for (int b1 = 0; b1 < (a + 1); b1++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int a1 = sum; a1 > 0; a1--) {
                for (int b3 = (sum + 2); b3 > (a1 + 1); b3--) {
                    System.out.print(" ");
                }
                for (int b4 = 0; b4 < (a1 - 1); b4++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}