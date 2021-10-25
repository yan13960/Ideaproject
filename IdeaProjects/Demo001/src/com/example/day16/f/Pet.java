package com.example.day16.f;

/**
 *
 */
public abstract class Pet {
   public String name;
   public int health;
  public int love;
    public Pet(String name, int health, int love) {
        super();
        this.name = name;
        this.health = health;
        this.love = love;
    }
    public String getName() {
        return name;
    }

    public void setName(String  newname) {
        this.name = newname;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health>=100) {
            this.health = 100;
        } else {
            this.health = health;
        }
    }
    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
    public abstract void speak();//宠物自白的行为
    public abstract void eat();// 吃的行为

}
