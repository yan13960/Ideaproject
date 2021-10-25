package com.example.day06作业;

import java.util.Scanner;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        System.out.println("我行我素购物管理系统>幸运抽奖\n");
        Scanner inPut=new Scanner(System.in);
        int vipCard=inPut.nextInt();
        System.out.println("请输入4位会员号"+vipCard);
        int random=(int)(Math.random()*10);
        int baiWei=vipCard/100%10;
        if (baiWei==random){
            System.out.println(vipCard+"号客户是幸运客户，获精美MP3一个。");
        }else{
            System.out.println(vipCard+"号客户，谢谢你的支持！");
        }
    }
}
