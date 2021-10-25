package com.example.day16作业.b;

/**
 *
 */
public class Lanuch {
    public static void main(String[] args) {
        //分别创建BoxDemo和PaperDemo的子类，当作参数传递给Machine类的构造方法。
        A4 a4=new A4();
        B5 b5=new B5();
        BlackBox blackBox=new BlackBox();
        ColorBox colorBox=new ColorBox();
        //分别创建4台不同的打印机
        Machine machine=new Machine(colorBox,a4);
        Machine machine1=new Machine(blackBox,a4);
        Machine machine2=new Machine(colorBox,b5);
        Machine machine3=new Machine(blackBox,b5);
        //调用不同的打印方法
        machine.startPrint();
        machine1.startPrint();
        machine2.startPrint();
        machine.startPrint();

        BoxDemo boxDemo=new BlackBox();
        PaperDemo paperDemo=new A4();
        Machine machine4=new Machine(boxDemo,paperDemo);
        machine.startPrint();
    }
}
