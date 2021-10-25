package com.example.day12.b;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("欢迎来到XXX宠物世界");
        System.out.println("请给宠物取个名吧");
        String sbqName = sc.next();
        // System.out.println("我输入的值为"+sbqName);
        System.out.println("请选择需要领养的宠物类型：1狗狗，2.企鹅");
        int typeId= sc.nextInt();
        //System.out.println(typeId);
        if (typeId==1){
           // System.out.println("领养狗狗");
            System.out.println("请选择狗儿的品种1：品种1  2.品种2");
            int strainId=sc.nextInt();
            String strain=null;
            if (strainId==1){
                strain="品种1";
            }else if (strainId==2){
                strain="品种2";
            }
            //1.创建对象
            Dog dog=new Dog();
            //2.给Dog赋值
            dog.name=sbqName;
            dog.strain=strain;
            //3.调用方法
            dog.print();
        }else {
            System.out.println("请选择企鹅的性别 1：Q仔  2.Q妹");
            int sexId=sc.nextInt();
            String sex=null;
            if (sexId==1){
                sex="Q仔";
            }else if (sexId==2){
                sex="Q妹";
            }
            //1.创建对象
            Penguin penguin=new Penguin();
            //2.给Penguin赋值
            penguin.name=sbqName;
            penguin.sex=sex;
            //3.调用方法
            penguin.print();
        }
    }

    /*public static void main(String[] args) {
        Dog dog=new Dog();
        System.out.println(dog.name);
    }*/
}
