package com.shijie.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明 接口中的属性,是 public static final
        System.out.println(IB.n1);//说明就是
        //IB.n1 = 30;说明n1是final

    }
}

interface IB {
    //接口中的属性,只能是final的,而且是 public static final 修饰符
    int n1 = 10;//等价 public static final int n1 = 10;
    void hi();
}

interface IC {
    void say();
}
//接口不能继承其他的类,但是可以继承多个别的接口
interface ID extends IB, IC {
}
//接口的修饰符只能是public和默认,这点和类的修饰符是一样的
interface IE{}

class Pig implements IB, IC {
    @Override
    public void hi() {
    }

    @Override
    public void say() {
    }
}