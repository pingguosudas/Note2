package com.shijie.smallchange;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Cash cash = new Cash("2021-01-21", "17:41", 100);
        Scanner myScanner = new Scanner(System.in);
        String[] detail = new String[5];
        for (int i = 0; i < detail.length; i++) {
            System.out.println("-----------------零钱通菜单-----------------");
            System.out.println("\t\t\t 1 零钱通明细");
            System.out.println("\t\t\t 2 收益入账");
            System.out.println("\t\t\t 3 消费");
            System.out.println("\t\t\t 4 退\t出");
            System.out.println("请选择(1-4):");
            System.out.println("-----------------零钱通明细-----------------");
            int getNum = myScanner.nextInt();
            if (getNum == 1) {
                System.out.println("零钱通明细（这部分未完成）");
                detail[i] = cash.toString();
                for (int j = 0; j < i; j++) {
                    System.out.println(detail[j]);
                }
            } else if (getNum == 2) {
                System.out.println("请输入收益入账金额");
                double income = myScanner.nextInt();
                cash.income(income);
            } else if (getNum == 3) {
                System.out.println("请输入消费金额");
                double expenditure = myScanner.nextInt();
                cash.expenditure(expenditure);
            } else if (getNum == 4) {
                return;
            }
        }
    }
}

class Cash {
    private String date;
    private String time;
    private double balance;

    public Cash(String date, String time, double balance) {
        this.date = date;
        this.time = time;
        this.balance = balance;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void income(double income) {
        this.balance += income;
    }

    public void expenditure(double expenditure) {
        this.balance -= expenditure;
    }

    @Override
    public String toString() {
        return "Cash{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", balance=" + balance +
                '}';
    }
}
