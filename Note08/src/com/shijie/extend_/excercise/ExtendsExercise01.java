package com.shijie.extend_.excercise;

public class ExtendsExercise01 {
    public static void main(String[] args) {
        //B b = new B();会输出什么?a, b name, b
        B b = new B();
    }
}

class A {
    A() {
        System.out.println("a");
    }

    A(String name) {
        System.out.println("a name");
    }
}

class B extends A {
    B() {
        this("abc");
        System.out.println("b");
    }

    B(String name) {
        //默认有一个super();
        System.out.println("b name");
    }
}
