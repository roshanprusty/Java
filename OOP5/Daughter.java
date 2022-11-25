package com.OOP5;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("I want to make news reporter");
    }

    @Override
    void partner()  {
        System.out.println("I love Virat");
    }
}
