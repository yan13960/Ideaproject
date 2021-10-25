package com.example.day17作业.c;

/**
 *
 */
public class Printer {
    public void printer(Coror coror, Size size) {
        System.out.println("使用"+coror.red()+"墨盒在"+size.A4()+"纸张上打印");
    }
    public void print(Coror coror, Size size){
        System.out.println("使用"+coror.white()+"墨盒在"+size.B5()+"纸张上打印");
    }
}
