package com.shijie.task;

/**
 * @author 石介
 * @version 1.0
 */
public class Task06 {//详情见task06包
    public static void main(String[] args) {
//        Environment environment = new Environment();
//        Environment environment0 = new Environment().getRiver();
//
//        new Person("唐僧", new Vehicles() {
//            @Override
//            public void work() {
//                if (environment == environment0) {
//                    Factory.getBoat().work();
//                    return;
//                }
//                Factory.getHorse().work();
//            }
//        });
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
interface Vehicles {
    void work();
}
class Horse implements Vehicles {

    @Override
    public void work() {
        System.out.println("马在跑");
    }
}
class Boat implements Vehicles {

    @Override
    public void work() {
        System.out.println("船在前进");
    }
}
class Airplane implements Vehicles {

    @Override
    public void work() {
        System.out.println("飞机在飞");
    }
}
class Factory {
    public static Horse getHorse() {
        Horse horse = new Horse();
        return horse;
    }
    public static Boat getBoat() {
        Boat boat = new Boat();
        return boat;
    }
    public static Airplane getAirplane() {
        Airplane airplane = new Airplane();
        return airplane;
    }
}
class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void passRiver() {
        //先得到船
        //判断一下,当前的vehicles属性是null,就获取一艘船

        //!(vehicles instanceof Boat)是判断当前的vehicles是不是Boat
        //(1) vehicles = null : vehicles instanceof Boat => false
        //(2) vehicles = 马对象: vehicles instanceof Boat => false
        //(3) vehicles = 船对象: vehicles instanceof Boat => true
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
    public void passFireMountain() {
        if (!(vehicles instanceof Airplane)) {
            vehicles = Factory.getAirplane();
        }
        vehicles.work();
    }
    public void common() {
        //得到马儿
        //判断一下,当前的vehicles属性是null,就获取一匹马
        if (!(vehicles instanceof Horse)) {
            //这里使用的是多态
            vehicles = Factory.getHorse();
        }
        //这里体现使用接口调用
        vehicles.work();
    }
}
//class Environment {
//    private Environment road;
//    private Environment river;
//
//    public Environment getRoad() {
//        return road;
//    }
//
//    public Environment getRiver() {
//        return river;
//    }
//}