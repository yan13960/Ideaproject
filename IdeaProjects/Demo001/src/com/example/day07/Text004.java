package com.example.day07;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        /*switch（可以使用 byte short char int string也是可以的，
        * jdk1.7之后是可以的 枚举Enum
        * switch开发过程中本身使用较少，都是if else 如果开发写 ，只会使用到一种int
        * 不可以使用的boolean double*/
        char num='a';
        switch (num){
            case'a':
                System.out.println("111");
                break;
            case 'b':
                System.out.println("222");
                break;
        }
        String num1="中";
        switch (num1){
            case"中":
                System.out.println("111");
                break;
            case "国":
                System.out.println("222");
                break;
        }
    }
}
