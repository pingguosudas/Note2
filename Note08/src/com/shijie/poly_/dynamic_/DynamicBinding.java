package com.shijie.poly_.dynamic_;

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum());//40 -> 30
        System.out.println(a.sum1());//30 -> 20
    }
}

class A {
    public int i = 10;
    //动态绑定
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {//父类getI
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getI() {//子类getI
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}