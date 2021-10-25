package com.example.day09;

/**
 *
 */
public class Text009 {
    public static void main(String[] args) {
        //2012年就已经培养了25万人    每年增长 25%  按照这增长速度，到哪一年将达到100万

        int year =  2012;
        double students = 250000;

        while (students<1000000){
            students=students+(students*0.25);
            year++;
            System.out.println(year+"年的学员为 "+students);
        }
        System.out.println(year);
    }
}
