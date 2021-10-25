package com.example.day15.g;
/**
 * final 永远  不可变，最终
 * 1.请问抽象类能不能加final ？  不能，加了就不能被继承
 * 2.类是可以加 final ，如果类加了final 能不能被继承? 不能
 * 3.抽象方法能不能加 final ？  不能
 */
public  abstract class Pet {
    //普通方法
    public void addPet(){}
    public abstract void delePet();
    public abstract String getStu(String name,int a);
}
