package com.example.day13.c;

/**
 *
 */
public class StaticDemo03 {
    //普通属性
    public int a=0;
    //静态属性
    public static  int b=0;

    //创建构造方法进行业务
    public StaticDemo03(){
        this.a=this.a+1;
        this.b=this.b+1;
        //a++;
        //b++;
    }
}
