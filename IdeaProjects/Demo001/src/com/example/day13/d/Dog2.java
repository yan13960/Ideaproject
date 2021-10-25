package com.example.day13.d;

/**
 * 1 第一步 发现类
 * 2.发现属性
 * 3.发现行为
 */
public class Dog2 {
    //2.发现属性
    public String name;
    public String strain;
    public int love;//与主人亲密度
    public char sex;
    public boolean flag;
    //这是标准写法，大家不要使用快捷方式，先自己去理解，下次课程还会讲

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getStrain(){
        return strain;
    }
    public void setStrain(String strain){
        this.strain=strain;
    }

    public int getLove() {
        return love;
    } public void setLove(int love) {
        this.love = love;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
