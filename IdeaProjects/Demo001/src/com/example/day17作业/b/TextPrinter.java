package com.example.day17作业.b;

/**
 *
 */
public class TextPrinter {
    public static void main(String[] args) {
        Printer printer=new Printer();

        PaperColor paperColor=new Colous();
        PaperSize  paperSize=new B5();
        printer.print(paperColor,paperSize);

        PaperColor paperColor1=new White();
        PaperSize paperSize1=new A4();
        printer.print(paperColor1,paperSize1);

        printer.print(paperColor,paperSize1);
    }
}
