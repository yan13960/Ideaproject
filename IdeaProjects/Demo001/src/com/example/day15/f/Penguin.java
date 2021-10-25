package com.example.day15.f;

/**
 *
 */
public class Penguin extends Pet {
    /**
     *我们可以说是重写，也可以是实现的意思
     */
    @Override
    public void deletePet() {

    }

    @Override
    public String gteStu(String name, int a) {
        return null;
    }
    /**
     * 以后开发，如果是接口+实现类，不可能在这个类加这种方法，加不报错，但不规范
     * 开发不可能是一个人写项目，是一个团队开发项目
     */
    public void getCCCCCC(){
        System.out.println("这是我自己的方法");
    }
}
