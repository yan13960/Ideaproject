package com.example.day14.d;

/**
 *
 */
public class Pet {
    private   String name;
    private  int love;//与主人亲密度
    private  int health;//健康值

    public void run(){
        //这里会有很多业务逻辑代码
        System.out.println("跑呀跑");
    }
       public Pet(){
        //super();  我这个不写，默认就是它
    System.out.println("父类的构造方法1");
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
