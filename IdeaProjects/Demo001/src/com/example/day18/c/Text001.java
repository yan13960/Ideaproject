package com.example.day18.c;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        System.out.println("某一天晚上 小花一人在家看电影,突然门铃响了..... ");
        //1.第一步创建 TheftProof3
        TheftProof3 theftProof3=new TheftProof3();
        //1拍照存档
        boolean flag=theftProof3.takePhoto();

        if (flag){
            System.out.println("是好人");
            theftProof3.openDoor(1);
        }else {
            System.out.println("看上去不像好人，走进厨房。。。。。。");
        }
    }
}
