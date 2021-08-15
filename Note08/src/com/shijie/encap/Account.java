package com.shijie.encap;

/**
 * 创建程序在其中定义两个类:Account和AccountTest类体会Java的封装性
 * 类要求具有属性:姓名(长度为2位3位或4位)余额(必须>20),
 * 密码(必须是6位),如果不满足,则给出提示信息,并给默认值(程序员自己定)
 * 通过setXxx的方法给Account的属性赋值
 * 在AccountTest中测试
 */
public class Account {
    //为了封装将3个属性设置为private
    private String name;
    private double balance;
    private String password;

    //提供两个构造器


    public Account() {
    }

    public Account(String name, double balance, String password) {
        setName(name);
        setBalance(balance);
        setPassword(password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //姓名(长度为2位3位或4位)
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名要求(长度为2位3位或4位),默认无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        //余额(必须>20)
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("余额(必须>20),默认余额0");
            this.balance = 0;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        //密码(必须是6位)
        if (password.length() == 6) {
            this.password = password;
        } else {
            System.out.println("密码位数不对,应该为6位,默认密码000000");
            this.password = "000000";
        }
    }

    //显示账号信息
    public void showInfo() {
        //增加权限的校验
        System.out.println("账号信息 名字=" + name + " 余额=" +
                balance + " 密码=" + password);
    }
}
