package com.example.day14.b;

/**
 *
 */
public class Penguin {
    private   String name;
    private  int love;//与主人亲密度
    private  int health;//健康值
    private  String sex;

    public  void run(){
        System.out.println("跑呀跑");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
