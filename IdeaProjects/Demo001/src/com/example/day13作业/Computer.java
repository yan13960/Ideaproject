package com.example.day13作业;

/**
 *
 */
public  class Computer {
    private   String brand;
    private   int ssd;
    private int time;
    private String CPU;
    private String type;
    private String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getCPU(){
        return CPU;
    }
    public void setCPU(String CPU){
        this.CPU=CPU;
    }
    public int getSsd(){
        return ssd;
    }
    public void setSsd(int ssd){
        this.ssd=ssd;
    }
    public int getTime(){
        return time;
    }
    public void setTime(int time){
        this.time=time;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.setTime(2020);
        computer.setBrand("联想");
        computer.setType("16G+500G");
        computer.setSsd(256);
        computer.setCPU("i7");;
        System.out.println("品牌为："+computer.getBrand());
        System.out.println("类型为："+computer.getType());
        System.out.println("出厂时间为："+computer.getTime());
        System.out.println("固态硬盘为"+computer.getSsd());
        System.out.println("CPU为："+computer.getCPU());
    }
}
