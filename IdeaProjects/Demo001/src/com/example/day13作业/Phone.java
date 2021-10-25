package com.example.day13作业;

/**
 *
 */
public class Phone {
    private String brand;
    private String type;
    private int model;
    private int time;
    private String CPU;

    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getModel(){
        return model;
    }
    public void setModel(int model){
        this.model=model;
    }
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time=time;
    }
    public String getCPU(){
        return CPU;
    }
    public void setCPU(String CPU){
        this.CPU=CPU;
    }
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.setBrand("苹果");
        phone.setModel(11);
        phone.setTime(2020);
        phone.setType("128G+6G");
        phone.setCPU("5nm A14 Bionic");
        System.out.println("品牌为："+phone.getBrand());
        System.out.println("手机型号为："+phone.getModel());
        System.out.println("出厂日期为："+phone.getTime());
        System.out.println("手机类型为："+phone.getType());
        System.out.println("处理器为："+phone.getCPU());
    }
}
