package com.example.day15.f;

/**
 * 在类中加上 abstract class Pet 这就是抽象类
 * 1.在方法上加个abstract  就是抽象方法
 * 2.类中有抽象方法的类，类必需为抽象 类
 * 3. 抽象方法没有方法体，抽象方法必需加;号结果     {}这里面的为方法体
 * 4.抽象类的可以有抽象方法，也可以有普通方法
 * 5.抽象类不能实例化
 * 6.请问抽象类能不能有构造方法 ？ 可以有  子类调用
 * 7.抽象类中的所有抽象方法，子类必需实现
 */
public abstract class  Pet {
    public  Pet(){
        System.out.println("我是构造方法");
    }
    //普通方法
    public  void  addPet(){}
    //抽象方法

    /**
     * 我们在开发的时候，刚开始，项目组长或经理是不要去设计接口，
     * 这个是经理写的，项目组长写的,架构师
     */
    public abstract void deletePet();

    public abstract String gteStu(String name,int a);
}
