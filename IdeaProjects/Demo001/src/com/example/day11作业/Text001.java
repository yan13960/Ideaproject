package com.example.day11作业;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
        Student input=new Student();
        input.getName(21);

        System.out.println("我家住在："+input.lociation);

        System.out.println(input.gethobby());

        System.out.println(input.print());

    }

    /**
     *
     */
    public static class Text002 {
        public static void main(String[] args) {
            Student.Computer input=new Student.Computer();
            input.print("联想",256);
        }
    }
}
