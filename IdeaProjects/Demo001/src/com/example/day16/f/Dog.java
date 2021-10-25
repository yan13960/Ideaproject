package com.example.day16.f;

/**
 *
 */
public class Dog extends Pet {
    /**
     * @param name
     * @param health
     * @param love
     */
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, String name, int health, int love) {
        super(name, health, love);
        this.breed=breed;
    }

    @Override
    public void speak() {
        System.out.println("宠物的自白");
        System.out.println("我的名字叫" + getName() + "我的健康状况是" + getHealth()
                + "我的品种是" + getBreed() + "我与主人的亲密度为" + getLove());
    }

    @Override
    public void eat() {
        super.health=super.health+3;
    }
    public void catchFlyingDisk(){
        System.out.println("正在玩接飞盘的游戏");
        super.health=super.health-5;
        super.love=super.love+5;
    }
}
