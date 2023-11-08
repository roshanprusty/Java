package com.OOP3.Inheritance;

public class Box {
    double l;
    double w;
    double h;
    String color="white";
//    Box(double l, double w, double h) {
//        this.l = l;
//        this.w = w;
//        this.h = h;
//    }
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
