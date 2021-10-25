package com.example.day17.a;

import java.util.Scanner;

/**
 *
 */
public class Shop {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        Master master=new Master();
        System.out.println("欢迎来到XXX宠物世界");
        System.out.println("请选择领养宠物类型1。狗狗 2.企鹅");
        int typeld=input.nextInt();
        Pet pet=master.getPet(typeld);
        if (null!=pet){
            System.out.println(pet);
            System.out.println("领养成功");
            pet.eat();
            pet.print();
            master.piay(pet);
            pet.print();
        }else
            System.out.println("领养失败");
    }
}
