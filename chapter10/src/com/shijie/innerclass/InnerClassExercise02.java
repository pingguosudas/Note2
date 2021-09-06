package com.shijie.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {
        /*
        1. 有一个铃声接口Bell里面有个ring方法.
        1. 有一个手机类Cellphone具有闹钟功能alarmClock,参数是Bell类型
        1. 测试手机的闹钟功能,通过匿名内部类(对象)作为参数,打印:懒猪起床了
        1. 在传入另一个匿名内部类(对象),打印:小伙伴们上课了
         */
        Cellphone cellphone = new Cellphone();
        //解读
        //1. 传递是实现了Bell接口的匿名内部类
        //2. 重写了ring
        //3. Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了");
        //            }
        //        }
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴们上课了");
            }
        });
    }
}
interface Bell {//接口
    void ring();//方法
}
class Cellphone {//类
    public void alarmClock(Bell bell) {//形参是Bell接口类型
        System.out.println(bell.getClass());
        bell.ring();
    }
}