package com.example.day09;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {

        //Test006 写的代码开发不会写
        for (int i=0;i<=5;i++){

            if(i==3){
                break;
                // continue;//只跳出本次循环
               // return;//这个以后天天用，后面课程会重点讲
            }
            System.out.println(i);
        }
        System.out.println("这里还是会输出的");
        //while里面用continue  我工作这么久，写过很多项目，没有这样用，用可以
    }
}
