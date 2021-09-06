package com.shijie.enum_;

/**
 * @author 石介
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season3.AUTUMN);
        System.out.println(Season3.SUMMER);
    }
}
//演示使用enum关键字来实现枚举类
enum Season3 {//类

    //定义了四个对象,固定.
//    public final static Season3 SPRING = new Season3("春天", "温暖");
//    public final static Season3 WINTER = new Season3("冬天", "寒冷");
//    public final static Season3 SUMMER = new Season3("夏天", "炎热");
//    public final static Season3 AUTUMN = new Season3("秋天", "凉爽");
    //如果使用了enum来实现枚举类
    //1. 使用关键字enum替代class
    //2. public final static Season3 SPRING = new Season3("春天", "温暖")
    //   直接使用SPRING("春天", "温暖") 解读:常量名(实参列表)
    //3. 如果有多个常量(对象),使用,号间隔即可
    //4. 如果使用enum来实现枚举,要求将定义常量对象,写在前面
    //5. 如果我们使用的是无参构造器,创建常量对象,则可以省略()
    SPRING("春天", "温暖"), WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"), AUTUMN("秋天", "凉爽")/*, WHAT*/;
    private String name;
    private String desc;//描述

    private Season3() {}//无参构造器

    private Season3(String name, String desc) {
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
        return "Season3{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}