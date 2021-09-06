package com.shijie.annotation_;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 石介
 * @version 1.0
 */
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class SuppressWarnings_ {

    //解读
    //1. 当我们不希望看到这些警告的时候,可以使用SuppressWarnings注解来抑制警告信息
    //2. 在{""}中,可以写入你希望抑制(不显示)警告信息
    //3. 可以指定抑制的警告类型有
        //all，抑制所有警告
        //boxing，抑制与封装/拆装作业相关的警告
        //cast，抑制与强制转型作业相关的警告
        //dep-ann，抑制与淘汰注释相关的警告
        //deprecation，抑制与淘汰的相关警告
        //fallthrough，抑制与switch陈述式中遗漏break相关的警告
        //finally，抑制与未传回finally区块相关的警告
        //hiding，抑制与隐藏变数的区域变数相关的警告
        //incomplete-switch，抑制与switch陈述式(enum case)中遗漏项目相关的警告
        //javadoc，抑制与javadoc相关的警告
        //nls，抑制与非nls字串文字相关的警告
        //null，抑制与空值分析相关的警告
        //rawtypes，抑制与使用raw类型相关的警告
        //resource，抑制与使用Closeable类型的资源相关的警告
        //restriction，抑制与使用不建议或禁止参照相关的警告
        //serial，抑制与可序列化的类别遗漏serialVersionUID栏位相关的警告
        //static-access，抑制与静态存取不正确相关的警告
        //static-method，抑制与可能宣告为static的方法相关的警告
        //super，抑制与置换方法相关但不含super呼叫的警告
        //synthetic-access，抑制与内部类别的存取未最佳化相关的警告
        //sync-override，抑制因为置换同步方法而遗漏同步化的警告
        //unchecked，抑制与未检查的作业相关的警告
        //unqualified-field-access，抑制与栏位存取不合格相关的警告
        //unused，抑制与未用的程式码及停用的程式码相关的警告
    //4. 关于SuppressWarnings作用范围适合你放置的位置相关
    //   比如@SuppressWarnings放置在main方法,那么抑制警告的范围就是main方法
    //   通常我们可以放置具体的语句,方法,类.
    //5. 看看@SuppressWarnings的源码
    //(1) 放置的位置就是TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE
    //(2) 该注解类有数组String[] value()设置一个数组比如{"rawtypes", "unchecked", "unused"}
    /*
    @Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface SuppressWarnings {
        String[] value();
    }
     */

    //@SuppressWarnings({"rawtypes", "unchecked", "unused"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }

    public void f1() {
        //@SuppressWarnings({"rawtypes"})
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }
}
