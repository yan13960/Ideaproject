package com.example.day16.f;

import java.util.Scanner;

/**
 *
 */
public class Pershop {
    public static void main(String[] args) {
        System.out.println("欢迎来到宠物商店");
        System.out.println("请输入要领养的宠物的名字");
        Scanner input=new Scanner(System.in);
        String  name=input.next();
        System.out.println("请输入你要领养的宠物的类型：（1 狗狗 2 企鹅)");
        int type=input.nextInt();
        Master master=new Master();
        switch(type){
            case 1:System.out.println("请输入狗的品种(1 聪明的拉布拉多犬 2苦苦的雪纳瑞)");
                int breed=input.nextInt();
                System.out.println("请输入狗的健康值");

                int health=input.nextInt();
                String s=null;
                if(breed==1){
                    s="聪明的拉布拉多犬";
                }else{
                    s="苦苦的雪纳瑞";
                }
                Dog dog=new Dog(s,name,health,20);
                System.out.println("喂养前：");
                dog.speak();

                master.feed(dog);
                System.out.println("喂养后：");
                dog.speak();
                master.play(dog);
                System.out.println("与主人玩耍后");
                dog.speak();

                break;
            case 2:
                System.out.println("请输入企鹅的性别(1Q仔 2Q妹)");
                int sex=input.nextInt();
                s=null;
                if(sex==1){
                    s="Q仔";
                }else{
                    s="Q妹";
                }
                System.out.println("请输入企鹅得健康值");
                health=input.nextInt();
                Penguin penguin=new Penguin(s,name,health,20);
                penguin.speak();

                master.feed(penguin);
                System.out.println("喂养后：");
                penguin.speak();
                master.play(penguin);
                System.out.println("与主人玩耍后");
                penguin.speak();
        }

    }
}
