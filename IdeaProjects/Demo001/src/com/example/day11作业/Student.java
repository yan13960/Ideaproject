package com.example.day11作业;

/**
 *
 */
public class Student {
    public String name="颜伟超";
    public String lociation="湖北省";
    public int age;
    public char sex='男';
    public double  weight=62.0;

    public  String  gethobby() {
        return "我的爱好是：\n喜欢打篮球，喜欢打游戏";
    }
    public String getName(int age){
        System.out.println("我的名字叫："+name);
        System.out.println("年龄:"+age);
        return name;
    }
    public String print(){
        return "我的性别是："+sex+"\n"+"我的体重是："+weight;
    }

    /**
     *
     */
    public static class Computer {
        public  String brand;
        public  int ssd;
        public int time=2021;
        public String CPU="I7";
        public String type="16+500G";

        public String print(String brand,int ssd){
            System.out.println("该电脑的品牌为"+brand+"固态硬盘为"+ssd);
            System.out.println("电脑出厂时间为："+time+"类型为："+type+"对应的cpu型号为："+CPU);
            return ssd+brand;
        }
    }
}
