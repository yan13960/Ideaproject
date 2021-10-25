package com.example.day13.b;

/**
 *
 */
public class Text02 {
   /* *//*public static void main(String[] args) {
        //之前开发的时候必需先new对象，才能调用
        StaticDemo02 s2=new StaticDemo02();
        System.out.println(s2.str1);
        s2.str1="aa";
        System.out.println(s2.str1);

        //静态属性能不能这样调用？ 可以完全没题题
        System.out.println(s2.str2);
        s2.str2="bb";
        System.out.println(s2.str2);
        ////调用普通方法
        s2.getA();
        //调用静态方法
        s2.getB();
    }*/
    public static void main(String[] args) {
        //之前每次一定要new对象
        System.out.println(StaticDemo02.str2);
        StaticDemo02.str2="BBB";
        System.out.println(StaticDemo02.str2);
        StaticDemo02.getB();

    }
}
