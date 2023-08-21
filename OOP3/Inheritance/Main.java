package com.OOP3.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1 = new Box();
        System.out.println(b1.h+" "+ b1.l+" "+ b1.w);

        BoxWeight b2 = new BoxWeight(9);
        System.out.println(b2.h+" "+ b2.l+" "+ b2.w+" "+ b2.weight);


    }
}
