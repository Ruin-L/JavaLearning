package com.kuang.base;

public class Demo03 {
    public static void main(String[] args) {
//        整数扩展: 进制 二进制0b 十进制 八进制0 十六进制0x
        int i = 10;
        int i2 = 010;//八进制
        int i3 = 0x10;//十六进制
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
//        ================================
//        浮点数扩展： 银行业务怎么表示
//        BigDecimal 数学工具类
        System.out.println(0.1 + 0.2);//0.30000000000000004
        System.out.println(0.1f + 0.2f);//0.3
//        ================================
//        float 有限 离散 舍入误差 大约 接近但不等于
//        double
//        最好完全避免使用浮点数进行比较
        float f = 0.1f;
        double d = 1.0 / 10;
        System.out.println(f == d);//false

//        ==================================
//        字符扩展
//        ==================================
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1);//强制转换
        System.out.println(c2);
        System.out.println((int) c2);//强制转换
//        所有的字符本质还是数字
//        编码 Unicode 表：97=a  65=A  48=0
//        U0000 UFFFF
//        ==================================
//        转义字符
//        ==================================
        System.out.println("Hello\nWorld");//换行
        System.out.println("Hello\tWorld");//制表符
        System.out.println("Helloooo\tWorld");//制表符
        System.out.println("Hello\rWorld");//回车
        System.out.println("Hello\bWorld");//退格
        System.out.println("Hello\"World\"");//双引号
        System.out.println("Hello\'World\'");//单引号
        String sa = new String("Hello");
        String sb = new String("Hello");
        System.out.println(sa == sb);//false

        String sc = "Hello";
        String sd = "Hello";
        System.out.println(sc == sd);//true
//        ==================================
//        布尔值扩展
//        ==================================
        boolean flag = true;
        if (flag) {
            System.out.println("真");
        } else {
            System.out.println("假");
        }
    }
}
