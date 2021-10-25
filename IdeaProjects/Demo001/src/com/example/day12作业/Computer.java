package com.example.day12作业;

/**
 *
 */
public class Computer {
    public Computer(){
        System.out.println("这是一个无参构造方法");
    }
    public Computer(String brand){
        System.out.println("该电脑的品牌为："+brand);
    }
    public Computer(int time,String CPU){
        System.out.println("电脑出厂时间为"+time+"\n"+"处理器为："+CPU);
    }
    public Computer(String type,int ssd){
        System.out.println("类型为："+type+"\n"+"固态硬盘为："+ssd);
    }

    public static void main(String[] args) {
        Computer computer=new Computer();

        Computer computer1=new Computer("联想");
        Computer computer2=new Computer(2020,"I7");
        Computer computer3=new Computer("16+1000",256);
    }
}
