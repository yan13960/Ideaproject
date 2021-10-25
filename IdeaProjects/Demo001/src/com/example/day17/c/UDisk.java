package com.example.day17.c;

/**
 *
 */
public class UDisk implements USBinterface {
    @Override
    public void service() {
        System.out.println("插入usb接口，开始传数据了....");
    }
}
