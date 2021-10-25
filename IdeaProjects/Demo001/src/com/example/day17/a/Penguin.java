package com.example.day17.a;

/**
 *
 */
public class Penguin extends Pet {
    @Override
    public void eat() {
        System.out.println("企鹅吃鱼吃完后健康值+8,与主人亲密度加15");
        super.setHealth(super.getHealth()+8);
        super.setLove(super.getLove()+15);
    }
    //游泳的方法
    public void swimming(){
        System.out.println(this.getName()+"主人带企鹅游泳 健康值减少10 亲密度加5");
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
    }
}
