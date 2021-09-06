package com.shijie.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.a);//23
        System.out.println(AA.a);//23
        System.out.println(BB.a);//23
    }
}
interface AA {
    int a = 23;//等价public static final int a = 23;
}
class BB implements AA {//正确
}