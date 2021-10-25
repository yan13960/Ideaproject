package com.example.day19;

import org.apache.log4j.Logger;

import java.util.Scanner;


/**
 *
 */
public class Text015 {
    static Logger com= Logger.getLogger(Text015.class.getName());
    public static void main(String[] args) {

        /**
         * try 可以配合 catch使用
         * try 可以配合 finally使用
         *  try 可以配合 catch  finally 一起使用
         */
        //这是标准写法
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("请输入被除数:");
            int num1 = in.nextInt();
            System.out.print("请输入除数:");
            int num2 = in.nextInt();
            System.out.println(String.format("%d / %d = %d",
                    num1, num2, num1/ num2));//这句代码开发100% 不写大家复制就好了
            System.exit(0);
        }catch (Exception e){
            com.error("你的程序有问题,你想写什么文字就写什么文字");

            e.printStackTrace();//各位同学只需要知道，这个就是把错误信息打印输出的方法
            //只有这一句话可以让finally 不执行，没意义，没人写
            System.exit(0);
        }finally {
            System.out.println("感谢使用本程序！");
        }

    }
}
