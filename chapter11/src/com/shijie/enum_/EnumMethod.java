package com.shijie.enum_;

/**
 * @author 石介
 * @version 1.0
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season枚举类,来演示各种方法
        Season3 autumn = Season3.AUTUMN;
        //输出枚举对象的名字
        System.out.println(autumn.name());
        //ordinal() 输出的是该枚举对象的次序/编号,从0开始编号
        //AUTUMN 枚举对象是第四个,因此输出3
        System.out.println(autumn.ordinal());
        //从反编译可以看出values方法,返回Season3[]
        //含有定义的所有枚举对象
        Season3[] values = Season3.values();
        System.out.println("===遍历取出枚举对象(增强for)====");
        for (Season3 season3 : values) {//增强for循环
            System.out.println(season3);
        }

        //valueOf:将字符串转换成枚举对象,要求字符串为已有的常量名,否则报异常
        //执行流程
        //1. 根据你输入的AUTUMN到Season3的枚举对象去查找
        //2. 如果找到了,就返回,如果没有找到,就报错
        Season3 autumn1 = Season3.valueOf("AUTUMN");
        System.out.println("autumn1=" + autumn1);
        System.out.println(autumn == autumn1);

        //compareTo:比较两个枚举常量,比较的就是编号
        //解读
        //1. 就是把Season3.AUTUMN枚举对象的编号和Season2.AUTUMN枚举对象的编号比较
        //2. 看看结果
        /*
        public final int compareTo(E o) {
            return self.ordinal - other.ordinal;
        }
        Season3.AUTUMN的编号[4] - Season3.SUMMER的编号[3]
         */
        System.out.println(Season3.AUTUMN.compareTo(Season3.SUMMER));

        //补充一个增强for循环
//        int[] nums = {1, 2, 9};
//        //普通的for循环
//        System.out.println("===普通的for====");
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        System.out.println("===增强的for====");
//        //执行流程是依次从nums数组中取出数据,赋给i,如果取出完毕,则退出for
//        for (int i : nums) {
//            System.out.println("i=" + i);
//        }
    }
}
