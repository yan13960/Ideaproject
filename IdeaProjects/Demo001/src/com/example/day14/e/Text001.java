package com.example.day14.e;

import javax.xml.soap.Text;

/**
 *
 */
public class Text001 {
    private  String a;//私有的
    String b;//默认的
    protected  String c;//受保护的
    public String d;//公开   公共

    public static void main(String[] args) {
        Text001 t=new Text001();
        System.out.println(t.a);
        System.out.println(t.b);
        System.out.println(t.c);
        System.out.println(t.d);
    }
}
