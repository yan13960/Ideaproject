package com.example.day19;

import java.util.Scanner;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        /**
         * try
         * 可能会产生异常的代码就放这里
         * try不能单独使用
         */ try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));//这句代码开发100% 不写大家复制就好了
            int i=10;
            if (i>6){
                System.out.println(10);
                return;
            }
        }

        /**
         * catch把异常信息打印输出
         */
            catch (Exception e){
                System.out.println("你的程序有问题");
                e.printStackTrace();//各位同学只需要知道，这个就是把错误信息打印输出的方法
                return;
            }
        System.out.println("感谢使用本程序！");
    }
}
