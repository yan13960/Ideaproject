package com.example.day17.a;

/**
 *
 */
public abstract class Pet {
    private String name="昵称1";
    private int love=80;
    private int health=80;
    /*
    * 喂食物的方法
    */
    public abstract void eat();
    public void print(){
        System.out.println("宠物的自白：我的名字叫"+this.name+"与主人亲密度" +
                ""+this.love+"健康值为"+this.health);
    }
//这里必需生成setter getter方法
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
        if (love>=100){
            this.love=100;
        }else {
            this.love=love;
        }
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", love=" + love +
                ", health=" + health +
                '}';
    }

    public void setHealth(int health) {
        if (health>=100){
            this.health=100;
        }else {
            this.health=health;
        }

    }
}
