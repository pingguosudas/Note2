package com.shijie.enum_;

/**
 * @author 石介
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;//OK
        Gender2 boy2 = Gender2.BOY;//OK
        System.out.println(boy);//BOY
//        public String toString { //源码
//            return name;
//        }
        System.out.println(boy == boy2);//true
    }
}
enum Gender2 {
    BOY, GIRL;
}