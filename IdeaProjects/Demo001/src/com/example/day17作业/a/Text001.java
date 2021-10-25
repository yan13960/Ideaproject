package com.example.day17作业.a;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
       Door door=new Master2();
       door.closeDoor();
       door.openDoor();

       Lock lock=new Master();
       lock.lookUp();
       lock.openLock();
    }
}
