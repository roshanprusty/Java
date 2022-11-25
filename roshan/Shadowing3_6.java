package com.roshan;

public class Shadowing3_6 {
    static int x=25; //this will be shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x); //25
        int x=29;
        System.out.println(x); //29
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
