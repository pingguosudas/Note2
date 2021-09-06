package com.shijie.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 石介
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {

    }

    public static void f2() throws FileNotFoundException, NullPointerException, ArithmeticException {
        //创建了一个文件流对象
        //解读:
        //1. 这里的异常是一个FileNotFoundException编译异常
        //2. 使用前面讲过的try-catch-finally
        //3. 使用throws,抛出异常,让调用f2方法的调用者(方法)处理
        //4. throws后面的异常类型可以是方法中产生的异常类型,也可以是它的父类
        //5. throws关键字后也可以是异常列表,即可以抛出多个异常
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
