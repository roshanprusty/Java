package com.OOP2;

public class StaticBlock {
    static int s=2;
    static int r;

    //will only run once, when the first obj is create i.e., when the class is loaded for the first time
    static {
        System.out.println("I am in static block");
        r=s*2;
    }
    public static void main(String[] args) {
        StaticBlock checkOut = new StaticBlock();
        System.out.println(checkOut.s+" "+checkOut.r);
        checkOut.r+=5;
        System.out.println(checkOut.s+" "+checkOut.r);
    }
}
