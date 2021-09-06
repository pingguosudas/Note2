package com.shijie.enum_;

/**
 * @author 石介
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);
    }
}

//演示自定义枚举实现
class Season2 {//类
    private String name;
    private String desc;//描述

    //定义了四个对象,固定.
    public final static Season2 SPRING = new Season2("春天", "温暖");
    public final static Season2 WINTER = new Season2("冬天", "寒冷");
    public final static Season2 SUMMER = new Season2("夏天", "炎热");
    public final static Season2 AUTUMN = new Season2("秋天", "凉爽");

    //1. 将构造器私有化,目的防止直接new
    //2. 去掉setXxx方法防止被属性修改
    //3. 在Season内部,直接创建固定的对象
    //4. 优化,可以加入final修饰符
    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}