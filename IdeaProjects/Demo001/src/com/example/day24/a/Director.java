package com.example.day24.a;

/**
 *
 */
public class Director extends Employee {
    @Override
    public void aaa() {
        super.aaa();
    }
public void bbb(){
    System.out.println(222);
}
    public static void main(String[] args) {
       // Employee employee=new Manger();
        //Director director=new Manger();
        Employee employee=new Director();
        Director director=(Director)new Employee();

        Director director1= (Director) new Employee();/*//Exception in thread "main" java.lang.ClassCastException: com.example.day24.a.Employee cannot be cast to com.example.day24.a.Director
        at com.example.day24.a.Director.main(Director.java:20)*/

        //Manger manger= new Manger();
    }
}
