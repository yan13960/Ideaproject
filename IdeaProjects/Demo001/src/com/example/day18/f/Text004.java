package com.example.day18.f;

import com.example.day17作业.b.Printer;

/**
 *
 */
public class Text004 {
    public static void main(String[] args) {

        //1.创建纸张对象
        Paper1 paper1=new A3Paper();
        //2.创建墨盒 对象
        InkBox2 inkBox2=new BlackInkBox();


        Paper1 paper11=new A4Paper();
        InkBox2 inkBox21=new RedInkBok();



        Printer3 printer3=new Printer3(paper11,inkBox21);
        printer3.print();
        Printer3 printer31=new Printer3(paper1,inkBox2);
        /*printer3.print();
        printer3.print();*/
    }
}
