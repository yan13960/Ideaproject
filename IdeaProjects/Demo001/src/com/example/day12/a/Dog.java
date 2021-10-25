package com.example.day12.a;

/**
 *
 */
public class Dog {
    public void getA(){
        System.out.println("无返回值，无参数");
    }
    public int getInt(){
        return 2;
    }
    //定义了一个方法，无返回值，谁调用了我请给我一个参数了，参数的值伟int类型
    public  void getB(int sbq){//形参
        System.out.println(sbq);
    }
    public void getStr(String sbq1){
        System.out.println(sbq1);
    }
//建议大家方法名目前不要写一样的，后面会重点讲
    //谁调用我这方法，请给我两个参数，第一个参数必需是int值 第二个必需是字符串
    public void getStr2(int num1,String str2){
        System.out.println(num1);
        System.out.println(str2);
    }
    //返回值为String
    public  String getStr3(String str1,String str2){
        //以后在实际开发，会根据传递过来的参数进行业务逻辑
        //然后返回不同的结果  以后课程会重点讲，目前讲不了
        String sbqSbq = str1+str2;
        //返回值这里，只能一个变量，我可以把值拼接
        return  sbqSbq;
    }
}
