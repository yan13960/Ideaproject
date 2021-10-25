package com.example.day15.f;

/**
 *
 */
//如果大家写了extends 报错的时候就要注意父类是否有抽象方法，你还没有重写
public  class Dog extends Pet{
    //这里面的代码是开发人员写的
    public   void deletePet(){
        //这里面可能就几百行代码‘
        System.out.println("删除Dog");
    }

    @Override
    public String gteStu(String name, int a) {
        return null;
    }


    public   String getStu(String name,int a){
        //通过传递过来的值，进行一系列业务逻辑代码处理，最终返回 String类型
        return "";
    }



}
