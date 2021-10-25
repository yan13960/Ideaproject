package com.example.day06作业;

import java.util.Scanner;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        double score = SC.nextDouble();
        if (score == 100) {
            System.out.println("爸爸给他买辆车");
        } else if (score >= 90 && score < 100) {
            System.out.println("妈妈给他买MP4");
        } else if (score >= 60 && score < 90) {
            System.out.println("妈妈给他买本参考书");
        }else{
            System.out.println("什么都不买");
        }
    }
}