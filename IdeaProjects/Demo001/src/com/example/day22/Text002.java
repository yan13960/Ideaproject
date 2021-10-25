package com.example.day22;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        /**
         * 找扩容源码    在  ArrayList 中的 add方法
         * 源码不会让我们修改
         *
         * jdk不同，源码不一样
         * int newCapacity = oldCapacity + (oldCapacity >> 1);
         *
         * 最简单方法 进入ArrayList  Alt+7显示所有方法 然后找到grow(int minCapacity)
         *
         */
        int oldCapacity=15;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        System.out.println(newCapacity);

        int num=10;
        /**
         * 10  转为二进制  为1010
         * >> 1  右移   相当于除2（10/2=5）    左边  101  右边
         * 题目只会出 左移
         * << 1  左移   相当于 乘2(10*2=20)    左边   10100 右边
         *
         * 这个只是为了面试题目，如果不懂移位，会 乘 除就好
         */
        num=num>>1;
        System.out.println(num);

        num =num<<1;
        System.out.println(num);
        int num2 = 4<<3;//4*2*2*2//这种只会出现在笔试题中
        System.out.println(num2);
    }
}
