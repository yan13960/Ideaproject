package com.example.day14.b;

/**
 *
 */
public class Dog {

    private   String name;
    private  int love;//与主人亲密度
    private  int health;//健康值

    private  String strain;//品种

    public  void run(){
        System.out.println("跑呀跑");
    }

    /**
     * 前面的大家一定不要使用快捷键，完成作业，现在就不要一个一写了
     * alt+ insert  如果是笔记本不能用的情况需要加 Fn  alt+ insert
     * 选择一个，按住shift不放再点最后一个
     */
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

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
