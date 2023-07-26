package com.kuang.opertate;

public class Demo03 {
    public static void main(String[] args) {
//        关系运算符返回的结果
        int flag = test(null);
        System.out.println(flag);
    }

    public static int test(String[] args) {
        int a = 10;
        int b = 20;
        return a + b;
       /* System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);*/

    }
}
