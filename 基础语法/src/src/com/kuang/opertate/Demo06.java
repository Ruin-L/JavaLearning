package com.kuang.opertate;

public class Demo06 {
    public static void main(String[] args) {
        /*
         * A=0011 1100
         * B=0000 1101
         * A&B=0000 1100
         * A|B=0011 1101
         * A^B=0011 0001
         * ~B=1111 0010
         * 2*8=16 2*2*2*2=16
         * 效率极高
         * << *2
         * >> /2
         *
         * */
        System.out.println(2 << 3);//16
    }
}
