package com.example.day16.f;

/**
 *
 */
public class Penguin extends Pet {
    /**
     * @param name
     * @param health
     * @param love
     */
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin(String sex, String name, int health, int love) {
        super(name, health, love);
        this.sex=sex;
    }

    @Override
    public void speak() {
        System.out.println("宠物的自白");
        System.out.println("我的名字叫" + name + "我的健康状况是" + getHealth() + "我的性别是"
                +getSex() + "我与主人的亲密度为" + getLove());
    }
    //TODO 重写父类的eat方法，健康值增加6
    @Override
    public void eat() {
super.health=super.health+6;
    }
    //TODO 定义子类特有的方法，游泳swimming
    //输出"正在游泳"，健康值减少3，与主人的亲密度增加5

    public void swimming() {//--1
        System.out.println("游泳");
        super.health = super.health-3;//--1
        super.love = super.love +5;//--1
    }
}
