package com.example.day22作业;

/**
 *
 */
public class Penguin {
    private String name;//名字
    private int health;//健康值
    private int love;//亲密度
    private String sex;//性别
    public void print(){
        System.out.println("宠物的自白");
        System.out.println("我的名字叫"+name+",健康值是"+health+",和主人的亲密度是"+love+",性别是"
                +sex);
    }
    public Penguin() {
    }

    public Penguin(String name, int health, int love, String sex) {
        this.name = name;
        this.health = health;
        this.love = love;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Penguin{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", love=" + love +
                ", sex='" + sex + '\'' +
                '}';
    }
}
