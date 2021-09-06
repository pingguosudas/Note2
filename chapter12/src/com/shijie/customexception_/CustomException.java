package com.shijie.customexception_;

/**
 * @author 石介
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) /*throws AgeException*/ {//若写了一个编译时异常的子类

        int age = 80;
        //要求范围在之间否则抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            //这里我们可以通过构造器设置,信息
            throw new  AgeException("年龄需要在18~120之间");
        }
        System.out.println("你的年龄范围正确.");
    }
}
//自定义一个异常
//解读
//1. 一般情况下,我们自定义异常是继承RuntimeException
//2. 即把自定义异常做成运行时异常,好处是,我们可以使用默认处理机制
//3. 即比较方便
class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}