package com.example.day08作业;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
            int sum = 0;	//当前之和
            int num = 2;	//加数
            while(num <= 100){
                sum = sum + num;	//累加
                num = num + 2;
            }
            System.out.println("100以内的偶数之和为：" + sum);
    }
}
