package com.shijie.extend_.excercise;

public class ExtendsExercise03 {
}

/*
编写Computer类,包含CPU、内存、硬盘等属性getDetails方法用于返回Computer的详细信息
编写PC子类,继承Computer类添加特有属性[品牌brand]
编写NotePad子类,继承Computer类,添加特有属性[color]
编写Test类,在main方法中创建PC和NotePad对象,分别给对象中特有的属性赋值,
以及从Computer类继承的属性赋值,并使用方法打印输出信息
 */
class Computer {
    private String CPU;
    private String RAM;
    private String ROM;

    public Computer(String CPU, String RAM, String ROM) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.ROM = ROM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getROM() {
        return ROM;
    }

    public void setROM(String ROM) {
        this.ROM = ROM;
    }

    public String getDetails() {
        return "CPU=" + CPU + " RAM=" + RAM + " ROM=" + ROM;
    }
}

class PC extends Computer {
    private String Brand;

    //这里IDEA根据继承的规则,自动把构造器的调用写好
    //这里也体现:继承设计的基本思想,父类的构造器完成父类的初始化
    //子类的构造器完成子类属性的初始化
    public PC(String CPU, String RAM, String ROM, String brand) {
        super(CPU, RAM, ROM);
        Brand = brand;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void printInfo() {
        System.out.println(getDetails() + " " + getBrand());
    }
}

class NotePad extends PC {
    String color;

    public NotePad(String CPU, String RAM, String ROM, String brand, String color) {
        super(CPU, RAM, ROM, brand);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void printInfo() {
        System.out.println(getDetails() + " " + getBrand() + " " + getColor());
    }
}

class Test {
    public static void main(String[] args) {
        PC pc = new PC("i7", "16G", "2128G", "AlienWare");
        NotePad notePad = new NotePad("i5", "8G", "1128G", "ROG", "Black");
        pc.printInfo();
        notePad.printInfo();
    }
}