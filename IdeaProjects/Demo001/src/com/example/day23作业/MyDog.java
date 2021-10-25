package com.example.day23作业;

/**
 *
 */
public class MyDog {
    public MyDog(int x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }



    public static void main(String args[]) {
        MyDog m1 = new MyDog(100);
        MyDog m2 = new MyDog(100);
        if (m1.equals(m2)) {
            System.out.println("Both are equal");
        } else {
            System.out.println("Both are not equal");
        }
    }
}

