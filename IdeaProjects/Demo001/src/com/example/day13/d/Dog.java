package com.example.day13.d;

/**
 * 1 第一步 发现类
 * 2.发现属性
 * 3.发现行为
 */
public class Dog {
    //2.发现属性
    public String name;
    public String strain;
    public int love;//与主人亲密度
    public char sex;
    //今天不懂没关系，下次还会讲
    public String getA(){
        return name;
    }
    public void setA(String name){
        this.name=name;
    }
}
