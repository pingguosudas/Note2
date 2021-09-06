package com.shijie.try_;

/**
 * @author 石介
 * @version 1.0
 */
public class TryCatchExercise03 {
}
class ExceptionExe01 {
    public static int method() {
        int i = 1;
        try {
            i++;//i = 2
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
            return ++i;//i = 3 => 保存临时变量 temp = 3;
        } finally {
            ++i;//i = 4
            System.out.println("i=" + i);
        }
    }
    public static void  main(String[] args) {
        System.out.println(method());
    }
}