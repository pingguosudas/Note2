package com.shijie.abstract_;

public class BB extends Template {

    public void job() {//这里也重写了Template类的job方法

        long num = 0;
        for (long i = 1; i <= 80000; i++) {
            num *= i;
        }
    }
}
