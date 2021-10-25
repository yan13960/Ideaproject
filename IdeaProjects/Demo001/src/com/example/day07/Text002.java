package com.example.day07;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        /**
         * 张三
         * 参加编程比赛
         *  第一名  笔记本电脑一台
         *  第二名  手机一部
         *  第三名   移动硬盘
         *  否则  什么也没有
         *   使用  switch 结构
         *   等下再讲注意事项
         */
        int num =2;

        /*switch (num){

        }*/
        //break；是跳出switch选择结果，没有没有一直执行到最后面
        //return；以后天天用，后面会重点讲，目前使用break
        //这不是标准写法
        switch (num){
            case 1:
                System.out.println("笔记本电脑一台1");
                break;
            case 2:
                System.out.println("手机一部2");
                break;
            case 3:
                System.out.println("移动硬盘3");
                break;
            default:
                System.out.println("什么都没有");
                break;
        }
        System.out.println("能不能输出5");
       /* if (num==1){
            System.out.println("笔记本电脑一台1");
        }else if (num==2){
            System.out.println("手机一部2");
        }else if (num==3){
            System.out.println("移动硬盘3");
        }else{
            System.out.println("什么都没有");
        }*/
    }
}
