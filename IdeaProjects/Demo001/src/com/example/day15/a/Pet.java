package com.example.day15.a;

/**
 * 继承
 * 1.创建父类Pet
 * 2.把相同的属性，代码抽取到父类
 * 3.子类必需继承
 *
 * alt+7列出所有方法
 */
public class Pet{

    private   String name;
    private  int love;//与主人亲密度
    private  int health;//健康值


    public  void  run(){

    }
    public Pet(String name, int love, int health) {
        this.name = name;
        this.love = love;
        this.health = health;
    }

    public Pet() {
    }

    public    void print(){
        System.out.println("打印输出");
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
}
