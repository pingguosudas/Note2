package com.shijie.task.task05;

public class Waiter extends Employee {
    //属性
    //工人,农民,服务生只有基本工资 sal
    public Waiter(String name, double sal) {
        super(name, sal);
    }

    //方法
    @Override
    public void printSal() {
        System.out.print("服务生 ");
        super.printSal();//使用父类的printSal()
    }
}
