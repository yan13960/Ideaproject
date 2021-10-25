package com.example.day16作业.a;

/**
 *
 */
public  class Colours extends Printer {
    @Override
    public void print() {
        System.out.println("彩色打印");
        this.setName("彩色打印机");
        this.setPaper("彩色纸张");
    }
}
