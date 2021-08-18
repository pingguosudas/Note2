package com.shijie.poly_.objectpoly_;

public class PolyObject {
    public static void main(String[] args) {
        //体验对象多态特点

        //animal编译类型就是Animal,运行类型Dog
        Animal animal = new Dog();
        //因为运行时,这时即执行到该行时,animal运行类型是Dog,所以cry就是Dog的cry
        animal.cry();//小狗汪汪叫

        //animal编译类型Animal,运行类型就是Cat
        animal = new Cat();
        animal.cry();//小猫喵喵叫
    }
}
