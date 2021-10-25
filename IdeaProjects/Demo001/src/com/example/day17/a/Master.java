package com.example.day17.a;

/**
 * 主人类
 *  负责喂食
 */
public class Master {
   /* *//**
     * 主人给Dog喂食
     *//*
    public void feed(Dog dog){
        dog.eat();
    }
    *//**
     * 主人给Penguin喂食
     *//*
    public  void feed(Penguin penguin){
        penguin.eat();
    }*/
    /**
     * 主人偷懒了，写一个方法即可
     * @param pet
     */
    public  void feed(Pet pet){
        pet.eat();
    }
     /*
   如果没有使用多态如何领养
   public Dog getDog(){
        Dog dog = new Dog();
        return dog;
    }
    public Penguin getPenguin(){
        Penguin penguin = new Penguin();
        return penguin;
    }*/
    /**
     *使用多态
     * 主人领养宠物
     */
    public Pet getPet(int sbq){
        Pet pet=null;
        if (sbq==1){
            pet=new Dog();
        }else if (sbq==2){
            pet=new Penguin();
        }
        return pet;
    }
    //在主人类一个玩的方法
    public void piay(Pet pet){
        System.out.println(pet);
        //pet 是不是  Dog
        //instanceof 开发不写，只有一些底层的代码会有
        if (pet instanceof Dog){
            Dog dog=(Dog)pet;
            dog.catchingFlyDisk();
        }else if (pet instanceof Penguin){
            Penguin penguin=(Penguin)pet;
            penguin.swimming();
        }
    }
}
