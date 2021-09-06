package com.shijie.main_;

public class Main02 {
    public static void main(String[] args) {
        //args是如何让传入
        //遍历显示
        for(int i = 0; i < args.length; i++) {
            System.out.println("第" + (i + 1) + "个参数=" + args[i]);
        }
    }
}
