package com.shijie.interface_;

public class Computer {
    //编写一个方法,计算机工作
    //解读:
    //1. UsbInterface usbInterface形参是接口类型UsbInterface
    //2. 看到接收实现了UsbInterface接口的类的对象实例
    public void work(UsbInterface usbInterface) {
        //通过接口,来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
