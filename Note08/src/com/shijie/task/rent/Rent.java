package com.shijie.task.rent;

import java.util.Scanner;

public class Rent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System_ system_ = new System_();
        int res;
        while (true) {
            System.out.println("-----------------房屋出租系统-----------------");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退       出");
            System.out.print("请选择(1-6): ");
            res = scanner.nextInt();
            switch (res) {
                case 1:
                    system_.add();
                    break;
                case 2:
                    System.out.println("\t\t\t2 查 找 房 屋");
                    break;
                case 3:
                    System.out.println("\t\t\t3 删 除 房 屋");
                    break;
                case 4:
                    System.out.println("\t\t\t4 修 改 房 屋 信 息");
                    break;
                case 5:
                    System.out.println("\t\t\t5 房 屋 列 表");
                    break;
                case 6:
                    return;
            }
        }
    }
}
