package com.example.day15.f;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        //Pet不能new 对象
        //后面会重点讲接口，以后都是这种用法,这是标准写法
         Pet pet = new Dog();
        pet.deletePet();

        Dog dog = new Dog();
         dog.deletePet();

        Pet pet1 = new Penguin();
        pet1.deletePet();

        Penguin penguin = new Penguin();
        penguin.getCCCCCC();

        /**后面还有接口，大家这个抽象类不要花太多时间，不要浪费这个时间在这上面
         * 暂时只需要把我讲的理解就可以了，以后100%不用
         */
    }
    }
