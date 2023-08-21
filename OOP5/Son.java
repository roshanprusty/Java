package com.OOP5;
public class Son extends Parent {
    @Override
    void carrer(){
        System.out.println("I want to become pilot");
    }
    @Override
    void partner(){
        System.out.println("I love Aayushi Verma");
    }

    public Son(int age) {
        super(age);
    }
}
