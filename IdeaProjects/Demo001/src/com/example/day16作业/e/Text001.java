package com.example.day16作业.e;

/**
 *
 */
public class Text001 {
    public static void main(String[] args) {
       /* CloseDoor closeDoor=new CloseDoor();
        OpenDoor openDoor=new OpenDoor();
        Master master=new Master();
        master.use(closeDoor);
        master.use(openDoor);

        CloseLock closeLock=new CloseLock();
        OpenLock openLock=new OpenLock();
        master.use1(openLock);
        master.use1(closeLock);*/

       Master master=new Master();
        Door door=new CloseDoor();
        master.use(door);
        Door door1=new OpenDoor();
        master.use(door1);

        Lock lock=new CloseLock();
        master.use1(lock);
        Lock lock1=new OpenLock();
        master.use1(lock1);





    }
}
