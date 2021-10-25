package com.example.day22作业;

/**
 *
 */
public class Phone {
    private String brand;
    private int model;

    public Phone(String brand, int model) {
        this.brand = brand;
        this.model = model;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                '}';
    }
}
