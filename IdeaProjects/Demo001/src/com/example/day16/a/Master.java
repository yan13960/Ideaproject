package com.example.day16.a;

/**
 * 主人类
 *  负责喂食
 */
public class Master {
    /**
     * 主人给Dog喂食
     */
    public void feed(Dog dog){
        dog.eat();
    }
    /**
     * 主人给Penguin喂食
     */
    public void feed(Penguin penguin){
        penguin.eat();
    }
    /**
     * 主人给Pig喂食
     */
    public void feed(Pig pig){
        pig.eat();
    }
}
