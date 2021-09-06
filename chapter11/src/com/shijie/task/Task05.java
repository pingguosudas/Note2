package com.shijie.task;

/**
 * @author 石介
 * @version 1.0
 */
public class Task05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A {
    private String name = "hello";
    public void f1() {
        class B {//局部内部类
            private final String NAME = "shijie";
            public void show() {
                //如果内部类和外部类的属性重名,可以通过外部类.this.属性名来指定
                System.out.println("NAME=" + NAME + " 外部类的name=" + name);
            }
        }
        B b = new B();
        b.show();
    }
}