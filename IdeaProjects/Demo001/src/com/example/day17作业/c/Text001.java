package com.example.day17作业.c;

import com.example.day17作业.b.White;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Printer printer=new Printer();
        Size size=new Sizes();
        Coror coror=new Colors();
        printer.printer(coror,size);
        printer.print(coror,size);


    }
}
