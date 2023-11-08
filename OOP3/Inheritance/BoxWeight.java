package com.OOP3.Inheritance;

public class BoxWeight extends Box{
    double weight;
    String color;


    BoxWeight(double weight){
        super();
        this.weight=weight;
    }
    BoxWeight(double l, double w, double h, double weight, String color){
        super(l,w,h);
        this.color=color;
        this.weight=weight;
    }
    @Override
    public void calling(){

    }
}
