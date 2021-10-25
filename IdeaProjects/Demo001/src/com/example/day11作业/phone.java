package com.example.day11作业;

/**
 *
 */
public class phone {
    public int time=2021;
    public String type="8+256g";
    public String brand;
    public String CPU;
    public int model;

    public String print(){
        return"手机品牌："+brand+"\n"+"出厂时间："+time+"\n"+"手机类型："+type+"\n"+"处理器为："+CPU
                +"\n"+"手机型号为："+model;
    }
    public int getTime(){
        return time;
    }

}
