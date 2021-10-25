package com.example.day18.e;

import com.example.day16作业.a.Printer;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {
        //1.创建纸张对象
        Paper1 paper1=new A3Paper();
        //2.创建墨盒 对象
        InkBox2 inkBox2=new BlackInkBox();
        Printer3 printer3=new Printer3(paper1,inkBox2);


        //Printer3 printer3=new Printer3(paper1,inkBox2);
        printer3.print();
    }
}
