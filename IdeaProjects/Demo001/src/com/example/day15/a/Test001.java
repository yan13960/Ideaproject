package com.example.day15.a;

public class Test001 {

    public static void main(String[] args) {
        Pet pet = new Pet("1",100,100);
        pet.print();

        /**就拿我们之前需求来说，我们都是领养狗  或企鹅
         * 父类我们不需要实例化吧？
         * 所有就有了抽象类，这还不是最终的，讲抽象类，是为了讲后面的接口
         * 以后开发都是面向接口开发
         * 抽象类很抽象
         */
        Pet pet1=new Penguin();
        Penguin penguin=(Penguin)pet1;
        ((Penguin) pet1).eat();
        penguin.eat();
    }
}
