package com.shijie.interface_;

public class Interface02 {
    public static void main(String[] args) {

    }
}

//解读
//1. 如果一个类实现接口
//2. 需要将接口的所有抽象方法都实现
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("hi()....");
    }
}