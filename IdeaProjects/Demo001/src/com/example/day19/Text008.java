package com.example.day19;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class Text008 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));//这句代码开发100% 不写大家复制就好了
            System.exit(0);
        }catch (InputMismatchException e){
            System.out.println("请输出数字");
        }catch (ArithmeticException e){
            System.out.println("除数不能为0");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("1111");
            e.printStackTrace();
        }finally {
            System.out.println("感谢使用本程序！");
        }


    }
}
