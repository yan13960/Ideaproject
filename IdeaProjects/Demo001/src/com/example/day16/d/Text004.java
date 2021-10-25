package com.example.day16.d;

import java.util.Scanner;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Master master=new Master();
        System.out.println("欢迎来到XXX宠物世界");
        System.out.println("请选择领养宠物类型1。狗狗 2.企鹅");
        int typeld=sc.nextInt();
        Pet pet=master.getPet(typeld);
        if (pet!=null){
            System.out.println(pet);
            System.out.println("领取成功");
            //喂食
            pet.eat();
        }else {
            System.out.println("领取失败");
        }
    }
}
