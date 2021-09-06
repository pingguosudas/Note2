package com.shijie.innerclass;

public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类,使用成员内部类的三种方式
        //解读
        //第一种方式
        //Outer08.new Inner08(); 相当于把new Inner08()当作outer08的成员
        //这就是一个语法,不用特别纠结
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

        //第二种方式 在外部类中,编写一个方法,可以返回Inner08对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();

        //第三种方式
        new Outer08().new Inner08().say();
    }
}
class Outer08 {//外部类
    private int n1 = 10;
    public String name = "张三";

    private void hi() {
        System.out.println("hi()方法...");
    }

    //1. 注意:成员内部类,是定义在外部类的成员的位置上
    //2. 可以添加任意访问修饰符(public、protected、默认、private),因为他是一个成员
    class Inner08 {//成员内部类
        private double sal = 99.8;
        private int n1 = 66;
        public void say() {
            //可以直接访问外部类的所有成员,包含私有的
            //如果成员内部类的成员和外部类的成员重名,会遵守就近原则,
            //可以通过 外部类名.this.属性 来访问外部类的成员
            System.out.println("n1=" + n1 + " name=" + name + " 外部类的n1=" + Outer08.this.n1);
            hi();
        }
    }
    //方法返回一个Inner08实例
    public Inner08 getInner08Instance() {
        return new Inner08();
    }

    //写方法
    public void t1() {
        //使用成员内部类
        //创建成员内部类的对象然后使用相关的方法
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}