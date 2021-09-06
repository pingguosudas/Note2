package com.shijie.task.task07;

/**
 * @author 石介
 * @version 1.0
 */
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    public Air getAir() {
        return new Air();
    }

    class Air {
        private int state = 0;

//        public void judge() {
//
//        }

        public void flow() {
            if (temperature > 40) {
                state = 1;
            } else if (temperature < 0) {
                state = 2;
            } else {
                state = 0;
            }
            switch (state) {
                case 0:
                    System.out.println(" 空调关闭...");
                break;
                case 1:
                    System.out.println(" 空调吹冷气...");
                break;
                case 2:
                    System.out.println(" 空调吹暖气...");
                break;
            }
        }
    }
}
