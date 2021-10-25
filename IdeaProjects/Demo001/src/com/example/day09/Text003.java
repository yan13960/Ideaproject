package com.example.day09;

import java.util.Scanner;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //输入 张三的5门成绩分数，求出总分数 ，并求出平均值

       /* for(int i=1;i<=5;i++){
            System.out.println("请输入张三的第"+i+"门成绩");
            //获取输入的成绩
            double score = sc.nextDouble();
            System.out.println("第"+i+"次的成绩为"+score);
        }*/

        //必需在最外层加一个变量
      /*  double count=0;
        for(int i=1;i<=5;i++){
            System.out.println("请输入张三的第"+i+"门成绩");
            //获取输入的成绩
            double score = sc.nextDouble();
            //System.out.println("第"+i+"次的成绩为"+score);
            count=count+score;
        }
*/
        double count=0;
        for(int i=0;i<5;i++){
            System.out.println("请输入张三的第"+(i+i)+"门成绩");
            //获取输入的成绩
            double score = sc.nextDouble();
            //System.out.println("第"+i+"次的成绩为"+score);
            count=count+score;
        }
        //求1...10 的   奇数
        System.out.println("张三的总分为"+count);

        System.out.println("张三的平均分数为"+(count/5));

    }
}
