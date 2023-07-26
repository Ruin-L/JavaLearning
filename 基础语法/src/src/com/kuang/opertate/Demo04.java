package com.kuang.opertate;

public class Demo04 {
    public static void main(String[] args) {
        int a = 3;
        int b = a++;//先赋值后自增
        int c = ++a;//先自增后赋值
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
//        幂运算 2^3 很多运算 我们会使用一些工具类来操作
        double pow = Math.pow(2, 3);
        System.out.println(pow);
    }
}
