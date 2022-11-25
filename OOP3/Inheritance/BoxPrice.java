package com.OOP3.Inheritance;

//Remember : constructor is required in a parent class for inheriting

public class BoxPrice extends BoxWeight{
    double cost;

    public BoxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    public BoxPrice(Box other, double weight, double cost) {
        super(other, weight);
        this.cost = cost;
    }

    public BoxPrice(double weight, double cost) {
        super(weight);
        this.cost = cost;
    }
}
