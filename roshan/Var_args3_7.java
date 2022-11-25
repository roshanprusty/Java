package com.roshan;

import java.util.Arrays;

public class Var_args3_7 {
    public static void main(String[] args) {
//        fun(2,3,3,6,9,47,5,9);
        multiple(2,3,"roshan","rohan");
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun2(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a, int b, String ...v){
        //remember --- variable length arguments always comes in end
        System.out.println();
    }
}
//-----------variable arguments