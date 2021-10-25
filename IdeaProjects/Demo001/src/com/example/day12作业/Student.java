package com.example.day12作业;

/**
 *
 */
public class Student {
    public Student(){
        System.out.println("这是无参数构造方法");
    }
    public Student(String lociation){
        System.out.println("我的家住在："+lociation);
    }
    public Student(String name,int age){
        System.out.println("我的名字叫"+name+",我今年的年龄是"+age);
    }
    public Student(char sex,String hobby){
        System.out.println("我的姓别是"+sex+",我的爱好是"+hobby);
    }

    public static void main(String[] args) {
        Student student=new Student();
        Student student1=new Student("湖北省");
        Student student2=new Student("颜伟超",21);
        Student student3=new Student('男',"唱歌");
    }
}
