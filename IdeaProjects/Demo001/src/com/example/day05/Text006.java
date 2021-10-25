package com.example.day05;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        //请问 80>60? 得到的结果为true
        if (80 > 60) {//请问我这个条件是否满足
            System.out.println("80>60,当然成立");
        }
        if (true) {
            System.out.println("80>60,当然成立2");
        }
        if (80 < 60) {
            System.out.println("不进来");
        }
            if (false) {
                System.out.println("不进来");
            }
            int num1 = 80;
            int num2 = 60;
            System.out.println(num1 > num2);
            if (num1 > num2) {
                System.out.println("80>60,当然成立3");
            }
            System.out.println("==============================");
            if (80 == 60) {
                System.out.println("能不能进来 不成立 不能");
            }
            System.out.println("===============================");
            if (80!=60){
                System.out.println("能不能进来 成立 4");
            }
            if (num1!=num2){
                System.out.println("能不能进来 成立 5");
            }
        }
    }


