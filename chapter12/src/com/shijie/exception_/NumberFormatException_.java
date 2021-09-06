package com.shijie.exception_;

/**
 * @author 石介
 * @version 1.0
 */
public class NumberFormatException_ {
    public static void main(String[] args) {
        String name = "shijie";
        //将String转成int
        int num = Integer.parseInt(name);//抛出NumberFormatException
        System.out.println(num);
    }
}
