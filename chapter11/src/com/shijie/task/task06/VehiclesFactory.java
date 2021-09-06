package com.shijie.task.task06;

/**
 * @author 石介
 * @version 1.0
 */
public class VehiclesFactory {
    private static Horse horse = new Horse();//饿汉式
    //马儿始终是同一匹
    //创建交通工具工厂类,有两个方法分别获得交通工具Horse和Boat
    //这里,我们将方法做成static
    public static Horse getHorse() {
        return horse;
    }
    public static Boat getBoat() {
        return new Boat();
    }
    public static Airplane getAirplane() {
        return new Airplane();
    }
}
