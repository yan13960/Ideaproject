package com.example.day14作业.b;

/**
 *
 */
public class Pet {
    private String name;
    public int health;
    public int love;

    public Pet() {
        super();//无参的构造方法
    }
    public Pet(String name,int health,int love){
        this.name=name;
        this.health=health;
        this.love=love;
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


}