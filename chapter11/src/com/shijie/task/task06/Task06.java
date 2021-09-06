package com.shijie.task.task06;

/**
 * @author 石介
 * @version 1.0
 */
public class Task06 {
    public static void main(String[] args) {
        Person tang = new Person("唐僧", new Horse());
        tang.common();//一般情况下
        tang.passRiver();//过河
        tang.common();//一般情况下
        tang.passRiver();//过河
        tang.passRiver();//过河
        tang.passRiver();//过河
        tang.passFireMountain();
    }
}
