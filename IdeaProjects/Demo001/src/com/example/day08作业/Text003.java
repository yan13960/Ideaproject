package com.example.day08作业;

/**
 *
 */
public class Text003 {
    public static void main(String[] args) {
        int year = 2012;
        double students = 250000;
        while (students <= 1000000) {
            students = students * (1 + 0.25);
            year = year + 1;
            System.out.println(year + "年");
        }
            System.out.println("第" + year + "年人数将达到"+students+"人");
    }
}
