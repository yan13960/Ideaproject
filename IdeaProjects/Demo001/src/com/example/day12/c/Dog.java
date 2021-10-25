package com.example.day12.c;

/**
 *
 */
public class Dog {
    public int a;//这就是一个成员变量
    //普通方法这里有 一个void 就是返回值  getA(这里面能是参数)
    public void getA(){
        System.out.println("这是一个普通方法");
    }
    /**
     * 构造方法： 需遵循的一些规范
     * 1.无返回值
     * 2.构造方法名必需与类名相同
     * 3.不能像普通方法那样被调用
     * 4.构造是在 new对象的时被调用
     * 5.如果我们没有创建构造方法，系统默认给我们创建一个无参的构造方法
     * 6.如果我们创建了不管是有能还是无参，系统不再给我们创建
     *   请各位同学务必记住了，如果你在类中创建了构造方法，请再加一个无参的
     *
     *   后面讲，加上参数，给成员变量赋值，今天不讲
     *Dog(里面没值，就没参)
     */
  /*  public Dog(){
        System.out.println("这就是构造方法1");
    }*/
    //这 是后面的事，后面重点讲
   /* public Dog(int b){
        System.out.println("这就是构造方法2");
    }*/
}
