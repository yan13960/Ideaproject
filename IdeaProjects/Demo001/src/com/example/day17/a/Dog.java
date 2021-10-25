package com.example.day17.a;

/**
 *
 */
public class Dog extends Pet {
    @Override
    public void eat() {
        System.out.println("狗狗吃狗粮,吃完后健康值+5,与主人亲密度加10");
        //必需通过setter方法
        if (this.getHealth()>=100){
            System.out.println("狗狗吃好了，不需要在喂食物了");
        }else {
            this.setHealth(super.getHealth()+5);
            this.setLove(super.getLove()+10);
        }
    }
    /*接飞盘的方法*/
    public void catchingFlyDisk(){
        System.out.println(this.getName()+"与主人正在玩接飞盘的游戏 健康值减少10 亲密度加5");
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
    }
}
