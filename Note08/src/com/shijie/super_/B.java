package com.shijie.super_;

public class B extends A {

    //public int n1 = 888;

    //编写测试方法
    public void test() {
        //super的访问不限于直接父类,如果爷爷类与本类有同名的成员,也可以使用super去访问爷爷类的成员:
        //如果多个基类(上级类)中都不同的成员,使用super访问遵循就近原则:A->B->C,
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    //可以访问父类的属性,但不能访问父类的private属性[案例]super.属性名
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }

    public void cal() {
        System.out.println("B类的cal()方法...");
    }

    //可以访问父类的方法,但不能访问父类的private方法[案例]super.方法名(形参列表)
    public void sum() {
        System.out.println("B类的sum()方法...");
        //希望调用父类-A的cal方法
        //这时因为子类没有方法因此我们需要使用下面三种方式

        //找cal方法(cal()和this.cal())时,顺序是:
        //(1) 先找本类,如果有,则调用
        //(2) 如果没有,则找父类(如果有,并可以调用,则调用)
        //(3) 如果父类没有,则继续找父类的父类,整个规则就是一样的,直到Object类
        //提示:如果查找方法的过程中,找到了,但是不能访问,则报错,cannot access
        //    如果查找方法的过程中,没有找到,则提示方法不存在,无法找到
        //cal();
        //this.cal();//等价于cal

        //找cal方法(super.cal())的顺序是直接查找父类,其他规则一样
        super.cal();

        //演示访问属性的规则
        //n1和this.n1查找的规则是
        //(1) 先找本类,如果有,则调用
        //(2) 如果没有,则找父类(如果有,并可以调用,则调用)
        //(3) 如果父类没有,则继续找父类的父类,整个规则就是一样的,直到Object类
        //提示:如果查找方法的过程中,找到了,但是不能访问,则报错,cannot access
        //    如果查找方法的过程中,没有找到,则提示属性不存在,无法找到
        System.out.println(n1);
        System.out.println(this.n1);

        //找n1方法super.n1的顺序是直接查找父类属性,其他规则一样
        System.out.println(super.n1);
    }

    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//能访问父类的private方法
    }

    //访问父类的构造器(这点前面用过):super.方法名(形参列表);只能放在构造器的第一句,只能出现一句
    public B() {
        //super();
        //super("jack", 10);
        super("jack");
    }
}
