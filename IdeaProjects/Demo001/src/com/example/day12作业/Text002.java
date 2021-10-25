package com.example.day12作业;

import java.util.Scanner;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        System.out.println("欢迎来到宠物店！");
        Scanner input=new Scanner(System.in);
        System.out.println("请输入要领养的宠物的名字：");
        String sbqname=input.next();
        String answer="y";
        while ("y".equals(answer)){
            System.out.println("请选择要领养的宠物类型：1、狗狗 2、企鹅 3、小猪");
            int typeId=input.nextInt();
            if (typeId==1){
                System.out.println("请选择狗狗的品种：(1、聪明的拉布拉多犬 2、酷酷的雪娜瑞)");
                int breadId=input.nextInt();
                String bread=null;
                if (breadId==1) {
                    bread = "聪明的拉布拉多犬";
                }else if (breadId==2){
                    System.out.println("酷酷的雪娜瑞");
                }else {
                    System.out.println("输入有误");
                    continue;
                }
                Dog dog=new Dog();
                dog.name=sbqname;
                dog.bread=bread;
                dog.print();
            } else if(typeId==2){
                System.out.println("请输入企鹅的品种：(1、Q仔 2、Q妹)");
                int sexId=input.nextInt();
                String sex=null;
                if (sexId==1){
                    sex="Q仔";
                }else if (sexId==2){
                    sex="Q妹";
                }else {
                    System.out.println("输入有误");
                    continue;
                }
                Penguin penguin=new Penguin();
                penguin.name=sbqname;
                penguin.sex=sex;
                penguin.print();
            }else if(typeId==3) {
                System.out.println("请输入小猪的品种：(1、小猪佩奇 2、小猪珍妮");
                int sexId=input.nextInt();
                String sex=null;
                if (sexId==1){
                    sex="小猪佩奇";
                }else if (sexId==2){
                    sex="小猪珍妮";
                }else {
                    System.out.println("输入错误");
                    continue;
                }
                Pig pig=new Pig();
                pig.name=sbqname;
                pig.sex=sex;
                pig.print();
            }else {
                System.out.println("输入有误");
                continue;
            }
            System.out.print("是否继续（y/n）");
            answer = input.next();
        }
        System.out.println("程序结束！");
    }
}
