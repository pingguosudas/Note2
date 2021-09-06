package com.shijie.task;

public class Task15 {
    public static void main(String[] args) {
        AAA obj = new BBB();
        AAA b1 = obj;
        System.out.println("obj的运行类型" + obj.getClass());//BBB
        obj = new CCC();
        System.out.println("obj的运行类型" + obj.getClass());//CCC
        obj = b1;
        System.out.println("obj的运行类型" + obj.getClass());//BBB
    }
}

class AAA {//超类

}
class BBB extends AAA {//父类

}
class CCC extends BBB {//子类

}