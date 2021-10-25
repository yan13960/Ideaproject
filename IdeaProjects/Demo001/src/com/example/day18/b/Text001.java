package com.example.day18.b;

import com.example.day13.c.StaticDemo04;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        System.out.println("某一天晚上 小王 想去外面浪。。。。 ");
        //1.第一步创建 TheftProof3
        TheftProof3 theftProof3=new TheftProof3();
        theftProof3.openDoor(StaticDemo004.TYPE_ID1);//小王在房间里面
        theftProof3.closeDoor(StaticDemo004.TYPE_ID2);//小王在房间外面
        System.out.println("可以放心的出去 浪。。。。");


        System.out.println("3点小王 回家了,到家门口了");
        theftProof3.openLock();
        theftProof3.openDoor(1);
        System.out.println("进入房间");
    }
}
