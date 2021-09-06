package com.shijie.task.task02;

/**
 * @author 石介
 * @version 1.0
 */
public class Task02 {
    public static void main(String[] args) {
        //args.length = 0

        if (args[4].equals("john")) {//可能发生ArrayIndexOutOfBounds
            System.out.println("AA");
        } else {
            System.out.println("BB");
        }
        Object o = args[2];//String->Object,向上转型
        Integer i = (Integer)o;//错误,这里一定会发生ClassCastException
    }
}
