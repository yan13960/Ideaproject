package com.example.day06;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("请输入张三的成绩");
        int score = inPut.nextInt();
        /*if (score>=90){
            System.out.println("考的不错，奖励一个MP3");
        }*/
        /*if (score>98){
            System.out.println("奖励");
        }
        if (score<=98){
            System.out.println("不奖励");
    }*/  if (score>98){
            System.out.println("奖励");
        }else {
            System.out.println("不奖励");
        }

    }
}
