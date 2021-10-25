package com.example.day07;

/**
 *
 */
public class Text1005 {
    public static void main(String[] args) {
        int num=2;
        if (num==1){
            System.out.println("笔记本电脑一台1");
            int num2=1;
            switch (num2){
                case 1:
                    System.out.println("笔记本电脑一台2");
                    break;
            }
        }else if (num==2){
            System.out.println("手机一部");
            int num2=1;
            switch (num2){
                case 1:
                    System.out.println("笔记本电脑一台2");
                    break;
            }
        }else if (num==3){
            System.out.println("移动硬盘");
            int num2=1;
            switch (num2){
                case 1:
                    System.out.println("笔记本电脑一台2");
                    break;
            }
        }else {
            System.out.println("什么也没有");
        }
    }
}
