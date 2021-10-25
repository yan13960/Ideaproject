package com.example.day19;

import java.util.Scanner;

/**
 *
 */
public class Text009 {
    public static void main(String[] args) {
        //调用我下面的方法
        test001();
        System.out.println("感谢使用本程序！");
    }

    private static void test001() {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));//这句代码开发100% 不写大家复制就好了
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
