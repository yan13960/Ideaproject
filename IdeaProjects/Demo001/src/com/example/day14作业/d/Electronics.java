package com.example.day14作业.d;

/**
 *
 */
public class Electronics extends Brand {
    public Electronics(){

    }
    public Electronics(String ename,String bname){
        super(bname);
        System.out.println("这是电子产品类2："+ename);
    }
}
