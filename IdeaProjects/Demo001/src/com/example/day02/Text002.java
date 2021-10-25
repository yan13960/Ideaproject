package com.example.day02;

/**
 *
 */
public class Text002 { public static void main(String[] args) {
    //以后在实际开发的时候  System.out.println(); 不会写
    System.out.println(888);

    /**
     * 定义变量  声明  = 赋值;        定义变量并赋值了
     * int 变量类型  int只能存整数
     * num变量名
     * 888 就时值
     * ; 每一行代码写完了必需加分号结束  ;
     */
    int num = 888;  //我并没有赋值
    System.out.println(num);

    //只是定义了变量，并没有赋值
    int num2;
    //现在我们这里是局部变量，大家不用管什么是局部变量，后面课程会讲解
    //局部变量必需赋值才能访问
    //System.out.println(num2);//这个是有问题的访问不了

    //只是定义了变量，并没有赋值
    int num3;
    num3 = 999;//给上面的变量赋赋值
    System.out.println(num3);
    num3 = 1000;
    System.out.println(num3);


    System.out.println("* *********************  double  存小数");

    //成绩  有小数位
    double score = 99.99;
    System.out.println(score);

    System.out.println("存字符  char  只能存一个，记住这一点即可  a或  1或  国");

    //存性别
    char sex = '男';

    System.out.println("存 布尔   只能存false 代表假  或true 代表真  ");
    boolean b = false;//后面课程还会重点讲
    System.out.println(b);

    System.out.println("存字符串  跟曾老师学JAVA 高薪就业");

    String str = "跟曾老师学JAVA 高薪就业";
    System.out.println(str);


    System.out.println("连接输出信息");

    System.out.println("aaa" + "bbbb" + "ccc");

    String str2 = "aaa";
    String str3 = "bbbb";
    String str4 = "ccc";
    System.out.println(str2 + str3 + str4);

    System.out.println("dd" + "str2" + "str4" + 1 + str4);
}
}
