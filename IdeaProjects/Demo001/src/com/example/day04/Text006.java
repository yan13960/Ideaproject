package com.example.day04;

/**
 *
 */
public class Text006 {
    public static void main(String[] args) {
        //int类型比 double小
        int num = 100;
        //小的可以直接转给大的，自动就转过去了
        double num2 = num;
        System.out.println(num2);

        //这个就不能这样转，为什么？ 因为double取自范围比int要大
        /*double num3=100;
        int num4=num3*/

        //开不不会这样转 如果我一定要转呢？，也可以，会损失精度
        double num3 = 100.999;//如果需要转，在需要转的变量前加  (需要转给什么类型)num3;
        int num4 = (int) num3;
        System.out.println(num4);

        String strNum = "123";
        Integer num444 = Integer.parseInt(strNum);//把字符串转为了int  Integer 是int包装类型
        System.out.println(num444);

        char c='c';
        String str5=String.valueOf(c);
        System.out.println(str5);
    }
}
