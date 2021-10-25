package com.example.day19;

import java.util.Scanner;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        /**
         * try
         * 可能会产生异常的代码就放这里
         * try不能单独使用
         */
        try{
            Scanner in=new Scanner(System.in);
            System.out.println("请输入被除数：");
            int num1=in.nextInt();
            System.out.println("请输入除数：");
            int num2=in.nextInt();
            System.out.println(String.format("%d/%d=%d",num1,num2,num1/num2));//这句代码开发100% 不写大家复制就好了
        }catch (Exception e){
            System.out.println("你的程序有问题");
            e.printStackTrace();//各位同学只需要知道，这个就是把错误信息打印输出的方法
        }
        System.out.println("感谢使用本程序");
    }
}
