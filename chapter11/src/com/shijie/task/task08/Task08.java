package com.shijie.task.task08;

/**
 * @author 石介
 * @version 1.0
 */
public class Task08 {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color color : colors) {
            //switch()中,放入枚举对象
            //在每个case后,直接写上在枚举类中,定义的枚举对象即可
            switch (color) {
                case RED:
                    System.out.print("匹配到红色:");
                    color.show();
                break;
                case BLUE:
                    System.out.print("匹配到蓝色:");
                    color.show();
                break;
                case BLACK:
                    System.out.print("匹配到黑色:");
                    color.show();
                    break;
                case YELLOW:
                    System.out.print("匹配到黄色:");
                    color.show();
                    break;
                case GREEN:
                    System.out.print("匹配到绿色:");
                    color.show();
                    break;
                default:
                    System.out.println("没有匹配到..");
            }
        }
    }
}
