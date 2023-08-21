package com.OOP5;

public class Daughter extends Parent{
    @Override
    void carrer(){
        System.out.println("I want to become Doctor");
    }
    @Override
    void partner(){
        System.out.println("I love Virat Kohli");
    }

    public Daughter(int age) {
        super(age);
    }
}
