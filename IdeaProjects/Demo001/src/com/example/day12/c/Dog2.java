package com.example.day12.c;

/**
 *
 */
public class Dog2 {
    //这是普通方法
    public  void  getA() {
        //以后这里会加if,现在还没还讲不了
        //以后这里有业务逻辑代码
    }
   /* **
     * 方法的重载， 需遵循的一些规范
     * 1.普通方法可以重载，构造方法可以重载
     * 2.与返回值无关 ,与返回值，没有任何关系
     * 3.必需在同一个类 方法名必需相同 ,参数的列表个数不同，或参数类型不同
     *
     * int(是类型) num（是变量名） 方法重载与变量名没有任何关系
     * 变量可以加N个
     * 我们可以根据我们传递过来不同的参数调用不同的方法
     */
   public  Dog2(){
       System.out.println("null");
       //这里面只是课用
   }
    public  Dog2(int num){
        System.out.println("1");
    }

    public  Dog2(int num,String str){
        System.out.println("2");
    }

    public  Dog2(String str2,int num){
        System.out.println("2");
    }

    public  Dog2(String str2,int num,int c){
        System.out.println("2");
    }

    public  Dog2(int num,String str2,int c){
        System.out.println("2");
    }

    public  Dog2(String str2,String str3){
        System.out.println("2");
    }
    public  Dog2(String str2,String str3,String str4){
        System.out.println("2");
    }
}
