package com.shijie.interface_;

public class InterfaceExercise02 {
}

interface A2 {
    int x = 0;
}
class B2 {
    int x = 1;
}
class C extends B2 implements A2 {
    public void pX() {
        //System.out.println(x);//错误原因不明确x
        //可以明确指定x
        //访问接口的x就使用A.x
        //访问父类的x就使用super.x
        System.out.println(A2.x + " " + super.x);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}