package com.example.day17.c;

/**
 *
 */
public class UsbFan implements USBinterface {
    @Override
    public void service() {
        System.out.println("插入usb接口，风扇开始工作");
    }
}
