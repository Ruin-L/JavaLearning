package com.kuang.base;

public class Demo08 {
    //    属性：变量
//    实例变量：从属于对象；如果不进行初始化，会有一个默认值 0 0.0 null
//    布尔值：默认是false
//    除了基本类型，其余的默认都是null
    String name;
    int age;
    static double salary = 2500;

    //    main方法
    public static void main(String[] args) {
//        局部变量；必须声明和初始化值
        int i = 10;
        System.out.println(i);
        Demo08 demo08 = new Demo08();
        System.out.println(demo08.age);
        System.out.println(salary);
//        类变量：static

    }

    //    其他方法
    public void add() {

    }
}
