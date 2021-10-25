package com.example.day11.d;

/**
 * 1 第一步 发现类
 * 2.发现属性
 * 3.发现行为
 */
public class Dog {
    //现在讲这个知识，是以后所有开发过程中必用的，很多同学到了后面课程还没搞清楚
    /**
     *方法
     *   void sleep()
     * void 无返回值   sleep()方法名
     *
     */
    public  void  sleep(){
        System.out.println("睡1");
    }
    //我这一个代码，我说了，我要返回一个int 类型的值
    public  int  getInt(){
        //以后开发，不会有这个代码 System.out.println("吃");
        //方法中会有业务逻辑代码，会根据不同的业务场景，返回不同的值，返回的值为int
        //后面课程还会讲
        //int num = 100;
        return  2;
    }
    public String getStr(){
        return "字符串2";
    }
}
