package com.example.day16作业.a;

/**
 *
 */
public  abstract class Printer {
    private String name;//打印机类型
    private String paper;//打出来的纸张效果

    /**
     * 定义抽象方法  由子类重写实现
     */
 public abstract void print();
 public void run(){
     System.out.println("我是一台："+name);
     System.out.println("我打出来的纸张是："+paper);
 }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPaper() {
        return paper;
    }

    public void setPaper(String paper) {
        this.paper = paper;
    }

}
