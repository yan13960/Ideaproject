package com.example.day17作业.b;

/**
 *
 */
public class Printer {
    public void print(PaperColor paperColor,PaperSize paperSize){
        System.out.println("使用"+paperColor.getColor()+"墨盒在"+paperSize.getSize()+"纸张上打印");
    }
}
