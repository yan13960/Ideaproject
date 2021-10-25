package com.example.day13.b;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 *
 */
public class StaticDemo01 {
    /**
     * 构造方法
     */
    public StaticDemo01(){
        System.out.println("这是构造方法1");
    }
    //代码块，已经不用，在new对象之前被调用
    {
        System.out.println("代码块，已经不用，在new对象之前被调用2");
    }
    //静态代码块，在类加载之前被调用，一般用于初始化参数
    static {
        System.out.println("我是静态代码块3");
    }
}
