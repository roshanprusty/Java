package com.Rec2;

import java.util.Scanner;

public class Concept {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        System.out.println(fun(num));
        fun(num);
    }

    static void fun(int num) {
        if(num==0) return;
        System.out.println(num);
        fun(--num);
//        fun(num--);
    }
}
