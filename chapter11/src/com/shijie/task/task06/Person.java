package com.shijie.task.task06;

/**
 * @author 石介
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //这里涉及到一个编程思想,就是可以把具体的要求,封装成方法
    public void passRiver() {
        //先得到船
        //判断一下,当前的vehicles属性是null,就获取一艘船

        //!(vehicles instanceof Boat)是判断当前的vehicles是不是Boat
        //(1) vehicles = null : vehicles instanceof Boat => false
        //(2) vehicles = 马对象: vehicles instanceof Boat => false
        //(3) vehicles = 船对象: vehicles instanceof Boat => true
        if (!(vehicles instanceof Boat)) {
            vehicles = VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void passFireMountain () {
        if(!(vehicles instanceof Airplane)) {
            vehicles = VehiclesFactory.getAirplane();
        }
        vehicles.work();
    }
    public void common() {
        //得到马儿
        //判断一下,当前的vehicles属性是null,就获取一匹马
        if (!(vehicles instanceof Horse)) {
            //这里使用的是多态
            vehicles = VehiclesFactory.getHorse();
        }
        //这里体现使用接口调用
        vehicles.work();
    }
}
