package com.shijie.pkg;

import com.shijie.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        //不同包下可以访问public修饰的属性和方法
        //但是不能访问protected,默认,private修饰的属性和方法
        System.out.println("n1=" + a.n1);
        a.m1();//public
        //不能访问a.m2(),a.m3(),a.m4()
    }
}
