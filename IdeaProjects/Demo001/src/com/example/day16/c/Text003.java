package com.example.day16.c;

/**
 *
 */
public class Text003 {
    //new对象
    public static void main(String[] args) {
        /*Pet pet=new Dog();
        pet.eat();
        Pet pet1=new Penguin();
        pet1.eat();

        Master master=new Master();
        master.feed(new Dog());
        master.feed(new Penguin());*/

        Master master=new Master();

        Dog dog=new Dog();
       // Pet pet=dog;
        Pet pet1=new Dog();//这就是规范
        master.feed(dog);
        master.feed(new Dog());
        //master.feed(pet);
        master.feed(pet1);


        Pet pet2=new Penguin();
        master.feed(pet2);

           Dog dog1=new Dog();
           Pet pet=dog1; //这就是自动类型转换  向上转型
        //强制类型转换  向下转型
           Dog dog2=(Dog)pet;
           master.feed(dog1);
           master.feed(dog2);
           master.feed(pet);

           Penguin penguin=new Penguin();
           Pet pet3=penguin;
           System.out.println("2");

        Pet pet4=new Penguin();
        Dog dog3=(Dog)pet4;//这句话会报错
        master.feed(dog2);


    }
}
