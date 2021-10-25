package com.example.day18.d;

/**
 *
 */
public class Printer3 {
    //打印机可以打印，但还需要 纸 和 墨盒
    Paper1 paper1;//把纸拿过来
    InkBox2 inkBox2;//把墨盒拿过来
    public void print(){
        System.out.println("使用"+inkBox2.getColor()+"墨盒在"+paper1.getSize()+"纸张上打印");
    }
}
