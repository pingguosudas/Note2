package com.shijie.modifier;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        a.m1();
        B b = new B();
        b.say();
    }
}

//只有默认和public可以修饰
class Tiger { }