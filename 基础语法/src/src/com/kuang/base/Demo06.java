package com.kuang.base;

public class Demo06 {
    public static void main(String[] args) {
//        操作比较大的数的时候，注意溢出问题
//        jdk7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;
        int total = money * years;//-1474836480
        long total1 = money * years;//默认是int类型，转换之前已经存在问题了
        long total2 = money * (long) years;//先把一个因子变成long类型，整个表达式发生提升
        System.out.println(total);//-1474836480
        long tatal3 = money * ((long) years);
        System.out.println(tatal3);//20000000000
    }
}
