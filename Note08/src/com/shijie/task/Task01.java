package com.shijie.task;

public class Task01 {
    public static void main(String[] args) {
        Person jack = new Person("jack", 12, "程序员");
        Person tom = new Person("tom", 20, "学生");
        Person mary = new Person("mary", 17, "老师");

        Person[] parr = new Person[3];

        parr[0] = jack;
        parr[1] = tom;
        parr[2] = mary;

        Person temp;

        for (int i = 0; i < parr.length; i++) {
            System.out.println(parr[i]);
        }

        for (int i = 0; i < parr.length - 1; i++) {
            for (int j = 0; j < parr.length - 1; j++) {
                if (parr[i].getAge() < parr[i + 1].getAge()) {
                    temp = parr[i];
                    parr[i] = parr[i + 1];
                    parr[i + 1] = temp;
                }
            }
        }

        System.out.println("============排序后分割线============");

        for (int i = 0; i < parr.length; i++) {
            System.out.println(parr[i]);
        }
    }

    /*
    定义一个Person类{name, age, job},初始化Person对象数组,有3个person对象
    并按照age从大到小进行排序,提示,使用冒泡排序
     */
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}