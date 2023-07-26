package com.kuang.opertate;

//逻辑运算符
public class Demo05 {
    public static void main(String[] args) {
//        与 或 非 学习
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        System.out.println(a > b && c > d);//false
        System.out.println(a > b || c > d);//false
        System.out.println(!(a > b));//true
//        短路运算
        int e = 5;
        boolean f = (e < 4) && (e++ < 4);
        System.out.println(f);//false
        System.out.println(e);//5

    }
}
