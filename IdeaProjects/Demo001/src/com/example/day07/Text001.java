package com.example.day07;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        /**
         * 张三
         * 参加编程比赛
         *  第一名  笔记本电脑一台
         *  第二名  手机一部
         *  第三名   移动硬盘
         *  否则  什么也没有
         *   使用  if  else 结构
         */
        int num=1;
        if (num==1){
        System.out.println("笔记本电脑一台");
        } else if (num==2){
            System.out.println("手机一部");
        }else if (num==3){
            System.out.println("移动硬盘");
        }else{
            System.out.println("什么都没有");
        }

    }
}
