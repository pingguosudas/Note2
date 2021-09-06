package com.shijie.try_;

import java.util.Scanner;

/**
 * @author 石介
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("请输入一个整数:");
        while (true) {
            try {
                num = Integer.parseInt(scanner.next());
                break;
            } catch (Exception e) {
                System.out.println("输入的不是一个整数,请重新输入:");
            }
        }
        System.out.println("输入成功,结果是" + num);
    }
}
