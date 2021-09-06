package com.shijie.task;

/**
 * @author 石介
 * @version 1.0
 */
public class Task04 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        //解读
        //1. 匿名内部类是
        /*
            new ICalculate() {
                @Override
                public double work(double n1, double n2) {
                    return n1 + n2;
                }
            }, 同时也是一个对象
            他的编译类型是ICalculate,他的运行类型就是匿名内部类
         */
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        }, 10, 8);//18.0
        cellphone.testWork(new ICalculate() {
            @Override
            public double work(double n1, double n2) {
                return n1 * n2;
            }
        }, 10, 8);
    }
}
interface ICalculate {
    double work(double n1, double n2);
}
class Cellphone {
    //解读,当我们调用testWork方法时,直接传入一个实现了ICalculate接口的匿名内部类即可
    //该匿名内部类,可以灵活实现work,完成不同的计算任务
    public void testWork(ICalculate iCalculate, double n1, double n2) {
        double result = iCalculate.work(n1, n2);//动态绑定
        System.out.println(iCalculate.getClass() + "计算后的结果是=" + result);
    }
}