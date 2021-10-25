package com.example.day24.d;

/**
 *
 */
public class test008 {
    private String name;
    private double grade;

    public test008(){

    }
    public test008(String name, double grade) {
        System.out.println( this.name = name);
        System.out.println(this.grade=grade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        test008 test008=new test008("1111",555);
        test008 t2=new test008();
        t2.setName("222");
        t2.setGrade(666);
        System.out.println(t2.getName()+"\n"+t2.getGrade());
    }
}
