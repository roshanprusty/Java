package com.OOP3.Inheritance;

public class BoxWeight extends Box{
    double weight;
    String color;


    BoxWeight(double weight){
        super();
        this.weight=weight;
    }
    BoxWeight(double l, double w, double h, double weight, String color, String color2){
        super(5,4,7, "white");
        this.weight=weight;
        this.color=super.color;

    }
}
