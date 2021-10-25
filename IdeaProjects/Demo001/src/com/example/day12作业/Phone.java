package com.example.day12作业;

/**
 *
 */
public class Phone {
    public Phone(){
        System.out.println("这是一个无参构造方法");
    }
    public Phone(String brand,int time){
        System.out.println("手机品牌为："+brand+"\n"+"出厂时间为："+time);
    }
    public Phone(String type){
        System.out.println("手机类型为："+type);
    }
    public Phone(int model,String cpu){
        System.out.println("手机型号为："+model+"\n"+"处理器为："+cpu);
    }

    public static void main(String[] args) {
        Phone phone=new Phone();

        Phone phone1=new Phone("苹果",2020);
        Phone phone2=new Phone("128G+6G");
        Phone phone3=new Phone(11,"5nm A14 Bionic");
    }
}
