package com.example.day24.d;

/**
 *
 */
class Person {
    public void fun() {
        this.print();//1111
    }

   private void print() {
        System.out.println("1.**********");
    }
}
 class Student extends Person {
    public void print() {
        System.out.println("2.##########");
    }
}
class Test {
    public static void main(String[] args) {
        new Student().fun();
        new Student().print();
    }
}

