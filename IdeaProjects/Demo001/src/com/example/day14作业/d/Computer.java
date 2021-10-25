package com.example.day14作业.d;

/**
 *
 */
public class Computer extends Electronics {

    public Computer(){
    }
    public Computer(String cname,String ename,String bname){
        super(ename,bname);
        System.out.println("这是电脑类3:"+cname);
    }
}
