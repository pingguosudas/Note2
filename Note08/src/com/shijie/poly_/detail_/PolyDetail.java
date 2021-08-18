package com.shijie.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型:父类的引用指向了子类的对象
        //语法:父类类型引用名 = new 子类类型();
        Animal animal = new Cat();
        Object obj = new Cat();//可以

        //向上转型调用方法的规则如下:
        //(1) 可以调用父类中的所有成员(需要访问权限)
        //(2) 但是不能调用子类的特有成员
        //(3) 因为在编译阶段,能调用哪些成员,是由编译类型来决定的
        //animal.catchMouse();错误
        //(4) 最终的运行效果看子类(运行类型)的具体实现,即调用方法时按照从子类(运行类型)开始查找方法,
        //然后调用,规则和我们前面讲的调用规则一致.
        animal.eat();//猫吃鱼..
        animal.run();//跑
        animal.show();//hello,你好
        animal.sleep();//睡

        System.out.println("ok");
    }
}
