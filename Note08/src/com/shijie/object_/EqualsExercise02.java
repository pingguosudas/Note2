package com.shijie.object_;

public class EqualsExercise02 {
    public static void main(String[] args) {
        Person_ p1 = new Person_();
        p1.name = "shijie";

        Person_ p2 = new Person_();
        p2.name = "shijie";

        System.out.println(p1 == p2);//false
        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.equals(p2));//false

        String s1 = new String("asdf");

        String s2 = new String("asdf");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1 == s2);//false
    }
}