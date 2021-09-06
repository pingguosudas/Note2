package com.shijie.task;

/**
 * @author 石介
 * @version 1.0
 */
public class Task02 {
}
class Frock {
    private static int currentNum = 100000;
    private int serialNumber;

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum() {
        return currentNum += 100;
    }

    public int getSerialNumber() {
        return serialNumber;
    }
}
class TestFrock {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200
        Frock frock1 = new Frock();
        System.out.println(frock1.getSerialNumber());//100300
        Frock frock2 = new Frock();
        System.out.println(frock2.getSerialNumber());//100400
        Frock frock3 = new Frock();
        System.out.println(frock3.getSerialNumber());//100500
    }
}