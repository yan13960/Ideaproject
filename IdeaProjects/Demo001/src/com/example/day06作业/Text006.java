package com.example.day06作业;

import java.util.Scanner;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入会员积分:");
        int jiFen=sc.nextInt();
        if (jiFen<2000){
            System.out.println("0.9");
        }else if (jiFen<4000){
            System.out.println("0.8");
        }else if (jiFen<8000){
            System.out.println("0.7");
        }else{
            System.out.println("0.6");
        }
    }
}
