package com.shijie.annotation_;

/**
 * @author 石介
 * @version 1.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);

    }
}


//解读
//1. @Deprecated修饰某个元素,表示该元素已过时
//2. 即不再推荐使用,但是仍然可以使用
//3. 查看Deprecated注解类的源码
//4. 可以修饰方法,类,字段,包,参数等等
//5. @Deprecated可以做版本升级过渡使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
@Deprecated
class A {
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi() {

    }
}