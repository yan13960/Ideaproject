package com.example.day14.c;

/***
 * 你爸是谁，要继承
 *  class Dog extends  你爸
 */
public class Dog extends Pet {
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
