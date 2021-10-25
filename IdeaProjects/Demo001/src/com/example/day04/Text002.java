package com.example.day04;

import java.util.Scanner;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        //接受我们输入的值，这个以后开发过程中100%不用，只是目前学习，需要使用到，会复制代码即可
        // 这一个，等我们学到了OOP你也自然懂了，，目前只需要会复制代码
        //拿到这个对象，可以接受我们输入的值
        Scanner sbqInput=new Scanner(System.in);
        System.out.println("请输入一个数字，int类型，前面先定义一个int的变量");
        int num=sbqInput.nextInt();
        System.out.println("接受到的int值为"+num);

        System.out.println("请接受一个double类型数据");
        double num2=sbqInput.nextDouble();
        System.out.println("接受到的double值为"+num2);

        System.out.println("请输入一个字符串");
        String str = sbqInput.next();
        System.out.println("接受到的字符串为"+str);

    }
}
