package com.shijie.try_;

/**
 * @author 石介
 * @version 1.0
 */
public class TryCatchExercise01 {
}
class Exception01 {
    public static int method() {
        try {
            String[] names = new String[3];
            if (names[1].equals("tom")) {//空指针
                System.out.println(names[1]);
            } else {
                names[3] = "shijie";
            }
            return 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            return 2;
        } catch (NullPointerException e) {
            return 3;
        } finally {
            return 4;
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}