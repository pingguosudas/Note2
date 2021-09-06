package com.shijie.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //类被加载的情况举例
        //1. 创建对象实例时(new)
        //AA aa = new AA();
        //2. 创建子类对象实例,父类也被加载,而且父类先被加载,子类后被加载
        //AA aa2 = new AA();
        //3. 使用类的静态成员时(静态属性,静态方法)
        //System.out.println(Cat.n1);

        //static代码块,是类在加载时执行的,而且只会执行一次.
        //DD dd = new DD();
        //DD dd1 = new DD();

        //普通的代码块,在创建对象实例时,会被隐式的调用
        //被创建一次,就会调用一次.
        //如果只是使用静态成员时,普通代码块并不会执行

        System.out.println(DD.n1);//8888
    }
}

class DD {
    public static int n1 = 8888;
    //静态代码块
    static {
        System.out.println("DD的静态代码块1被执行...");//1
    }
    //普通代码块,在对象时被调用而且是每创建一个对象就调用一次
    //可以这样理解,普通代码块是构造器的补充
    {
        System.out.println("DD的普通代码块...");
    }
}

class Animal {
    //静态代码块
    static {
        System.out.println("Animal的静态代码块1被执行...");//1
    }
}

class Cat extends Animal {

    public static int n1 = 999;//静态属性

    //静态代码块
    static {
        System.out.println("Cat的静态代码块1被执行...");//1
    }
}

class BB {
    //静态代码块
    static {
        System.out.println("BB的静态代码块1被执行...");//1
    }
}

class AA extends BB {

    //静态代码块
    static {
        System.out.println("AA的静态代码块1被执行...");//2
    }
}