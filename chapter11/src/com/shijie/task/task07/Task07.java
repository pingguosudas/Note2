package com.shijie.task.task07;

/**
 * @author 石介
 * @version 1.0
 */
public class Task07 {
    public static void main(String[] args) {
        Car car1 = new Car(41);
        car1.getAir().flow();
        Car car2 = new Car(-10);
        car2.getAir().flow();
        Car car3 = new Car(25);
        car3.getAir().flow();
    }
}
