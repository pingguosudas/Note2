package com.shijie.extend_;

import java.util.Arrays;
import java.util.Scanner;

//输入ctrl+H可以看到类的继承关系
public class Sub extends Base {//子类

    public Sub(String name, int age) {
        //1. 要调用父类的无参构造器,如下或者什么都不写,默认就是调用super()
        //super();//父类的无参构造器
        //2. 如果要调用父类的public Base(String name)
        //super("jack");
        //3. 如果要调用父类的 Base(String name, int age)
        super("smith", 20);

        //细节:super在使用时,必须放在构造器第一行
        //细节:super()和this()都只能放在构造器第一行,因此这两个方法不能共存在一个构造器
        //this()不能再使用了
        System.out.println("子类Sub(String name, int age)构造器被调用....");

        //Arrays.sort();对Arrays使用ctrl+H看到Object
    }

    public Sub() {//无参构造器
        //super();//默认调用父类的无参构造器
        super("smith", 10);
        System.out.println("子类Sub()构造器被调用....");
    }

    public Sub(String name) {
        super("tom", 30);
        //do nothing...
        System.out.println("子类Sub(String name)构造器被调用....");
    }

    public void sayOk() {//方法
        //非私有的属性和方法可以在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();
        //要通过父类提供公共方法去访问
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
