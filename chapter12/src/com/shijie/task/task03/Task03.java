package com.shijie.task.task03;

/**
 * @author 石介
 * @version 1.0
 */
public class Task03 {
    public static void func() {
        try {
            throw new RuntimeException();//2
        } finally {
            System.out.println("B");//1
        }
    }
    public static void main(String[] args) {
        try {
            func();
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("C");//3
        }
        System.out.println("D");//4
    }
}
