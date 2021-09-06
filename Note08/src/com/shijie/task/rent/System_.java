package com.shijie.task.rent;

public class System_ {
    private String name;
    private int phoneNum;
    private String address;
    private double mRent;
    private double state;

    public System_() {
    }

    public System_(String name, int phoneNum, String address, double mRent, double state) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
        this.mRent = mRent;
        this.state = state;
    }

    public void add() {
        System.out.println("---------------------添加房屋---------------------");
        System.out.println("姓名: " + name);
        System.out.println("电话: " + phoneNum);
        System.out.println("地址: " + address);
        System.out.println("月租: " + mRent);
        System.out.println("状态(未出租/已出租): " + state);
        System.out.println("---------------------添加完成---------------------");
    }
}
