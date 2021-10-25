package com.example.day13作业;

/**
 *
 */
public class Student {
    private String name;
    private String lociation;
    private String sex;
    private boolean flag;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLociation(){
        return name;
    }
    public void setLociation(String lociation){
        this.lociation=lociation;
    }
    public String getSex(){
        return sex;
    }
    public  void setSex(String sex){
        if ("男".equals(sex)||"女".equals(sex)){
            this.sex=sex;
        }else{
            System.out.println("你输入的性别有误");
        }
    }
    public boolean isFlag(){
        return flag;
    }
    public void setFlag(boolean flag){
        this.flag=flag;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    public static void main(String[] args) {
        Student student=new Student();
        student.setName("颜伟超");
        student.setAge(21);
        student.setFlag(false);
        student.setLociation("湖北省");
        student.setSex("男");

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.isFlag());
        System.out.println(student.getLociation());
        System.out.println(student.getSex());
    }
}
