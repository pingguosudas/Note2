package com.shijie.try_;

/**
 *
 * @author 石介
 * @version 1.0
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {

        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());//NullPointerException
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;//ArithmeticException
        } catch (NullPointerException e) {
            System.out.println("空指针异常=" + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("算数异常=" + e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}