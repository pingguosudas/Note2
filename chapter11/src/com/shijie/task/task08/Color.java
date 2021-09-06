package com.shijie.task.task08;

/**
 * @author 石介
 * @version 1.0
 */
public enum Color implements IMyInterface {
    RED(255, 0, 0), BLUE(0, 0, 255), BLACK(0, 0, 0), YELLOW(255, 255, 0), GREEN(0, 255, 0);
    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println(" 属性值为: " +redValue + ", " + greenValue + ", " + blueValue);
    }
}
