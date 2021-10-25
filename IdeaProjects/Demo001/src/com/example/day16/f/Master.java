package com.example.day16.f;

/**
 *
 */
public class Master {
    //喂养动物的方法feed
    public void feed(Pet pet) {
        pet.eat();
    }

    // 定义与宠物玩耍的方法play
    //如果是狗,则玩接飞盘游戏
    //如果是企鹅，则游泳
    public void play(Pet pet) {
        if (pet instanceof Dog) {
            ((Dog) pet).catchFlyingDisk();
        } else if (pet instanceof Penguin) {
            ((Penguin) pet).swimming();
        }
    }
}
