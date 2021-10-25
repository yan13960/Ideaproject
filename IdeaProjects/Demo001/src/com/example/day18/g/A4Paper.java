package com.example.day18.g;

/**
 *
 */
public class A4Paper implements Paper1 {
    /**
     * 取纸的一个方法
     * A3  A4通常打印资料使用A3    学校试卷一般A3
     */
    @Override
    public String getSize() {
        return "A4";
    }
}
