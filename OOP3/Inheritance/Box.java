package com.OOP3.Inheritance;

public class Box {
//    private double l; ---> other file cannot access those members of the superclass that have been declared as private.
//                      ---> except this class no other class can access the private member
    double l;
    double w;
    double h;
//    double weight;

    ///constructor overloading --> according to given argument the constructor has been selected.

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
    Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }
    Box(Box obj) {
        this.l = obj.l;
        this.w = obj.w;
        this.h = obj.h;
    }

    public void calling(){
        System.out.println("---------");
    }

}
