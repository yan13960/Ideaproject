package com.example.day19;

import java.util.Scanner;

/**
 *
 */
public class Text010 {
   /* public static void main(String[] args) {
        try {
            //调用我下面的方法
            test001();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("感谢使用本程序！");
    }*/
   public static void main(String[] args)throws Exception {
       //调用我下面的方法
       test001();
       System.out.println("感谢使用本程序！");
   }
    //这位程序员很牛逼，已经知道，我这个方法有错，谁调用我，请你自己解决
    private static void test001 ()throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入被除数:");
        int num1 = in.nextInt();
        System.out.print("请输入除数:");
        int num2 = in.nextInt();
        System.out.println(String.format("%d / %d = %d",
                num1, num2, num1/ num2));//这句代码开发100% 不写大家复制就好了

    }
    }

