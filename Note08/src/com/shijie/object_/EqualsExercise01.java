package com.shijie.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("jack", 10, '男');
        Person person2 = new Person("jack", 10, '男');
        System.out.println(person.equals(person2));//true
    }
}
