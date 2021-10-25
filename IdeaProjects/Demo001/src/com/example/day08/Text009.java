package com.example.day08;

import java.util.Scanner;

/**
 *
 */
public class Text009 {public static void main(String[] args) {
    //这个代码100%开不发不写
    Scanner sc = new Scanner(System.in);

    String answer=null;
    System.out.println("张三上午上课，");
       /* do{

            System.out.println("写作业，写作业");
            System.out.println("完成了吗？  y  /  n");
            answer=sc.next();
        }while (!"y".equals(answer) );*/

    boolean  b;
    do{

        System.out.println("写作业，写作业");
        System.out.println("完成了吗？  y  /  n");
        answer=sc.next();
        //我不写了，大家自己完成
        if("y".equals(answer))  {
            //y要不要写 不用
            b = false;
        }else {
            b = true;
        }

    }while (b);

    System.out.println("完成了，想干嘛就干嘛");


}
}

