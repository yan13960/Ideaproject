package com.example.day08作业;

import java.util.Scanner;

/**
 *
 */
public class Text010 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("请输入班级总人数：");
        int num=0;
        int persons=input.nextInt();
        for (int i=1;i<=persons;i++){
            System.out.print("请输入第"+i+"位学生的成绩");
            double grade=input.nextDouble();
            if (grade<80){
                continue;
            }num++;
        }
        System.out.println("80分以上的学生人数是："+num);
        double ratio=num*1.0/persons*100;
        System.out.println("80分以上的学生所占的比例是："+ratio+"%");
    }
}
