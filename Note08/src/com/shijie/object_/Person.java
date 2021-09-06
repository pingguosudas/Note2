package com.shijie.object_;

//判断两个Person对象的内容是否相等,
//如果两个对象的各个属性值都一样,则返回true反之false
public class Person {
    private String name;
    private int age;
    private char gender;

    //重写Object的equals方法
    public boolean equals(Object obj) {
        //判断如果比较的两个对象是同一个对象,则直接返回true
        if (this == obj) {
            return true;
        }
        //类型判断
        if (obj instanceof Person) {//是Person,我们才比较

            //进行向下转型,因为需要得到obj的各个属性
            Person person = (Person) obj;
            return (this.name).equals(person.name) && this.age == person.age && this.gender == person.gender;
        }
        //如果不是Person,则直接返回false
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
