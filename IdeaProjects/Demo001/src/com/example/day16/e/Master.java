package com.example.day16.e;

/**
 *
 */
public class Master {
    /**
     * 主人给Dog喂食
     */
   /* public  void feed(Dog dog){
        dog.eat();
    }*/

    /**
     * 主人给Penguin喂食
     */
   /* public  void feed(Penguin penguin){
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
}
