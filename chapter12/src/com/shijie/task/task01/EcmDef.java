package com.shijie.task.task01;

import java.util.InputMismatchException;

/**
 * @author 石介
 * @version 1.0
 */
public class EcmDef {
    public static void main(String[] args) {

        try {
            if (args.length != 2) {
                throw new InputMismatchException("参数个数不对");
            }
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);//该方法可能抛出
            System.out.println("计算结果是=" + res);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException  e) {
            System.out.println("参数的格式不正确,需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }
    public static double cal(int n1, int n2) {
        return n1 / n2;//(n1 + 0.0),这里结果为infinity
    }
}
