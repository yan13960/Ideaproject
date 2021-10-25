package com.example.day09;

/**
 *
 */
public class Text007 {
    public static void main(String[] args) {
    //开发不会这样写，我还是第一次这样在 while用continue
    int num=1;
    while (num<=5){
        if (num==3){
            num++;
            continue;
        }else {
            System.out.println(num);
        }
        num++;
    }

    System.out.println("这里还是会输出 ");
}
}
