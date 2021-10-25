package com.example.day17.c;

/**
 *
 */
public class Text002 {
    public static void main(String[] args) {
        USBinterface usBinterface=new UsbFan();
        usBinterface.service();

        USBinterface usBinterface1=new UDisk();
        usBinterface1.service();
    }
}
