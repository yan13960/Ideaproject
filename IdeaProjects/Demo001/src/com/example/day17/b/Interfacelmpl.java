package com.example.day17.b;

/**
 *
 */
public class Interfacelmpl implements InterfaceDemo001,InterfaceDemo002 {
    @Override
    public int addUser(String name, String pwd) {
        return 0;
    }

    @Override
    public void getCCC() {

    }

    @Override
    public void getCCC3() {

    }

    @Override
    public int deleteUser(int id) {
        System.out.println(id);
        return 0;
    }
}
