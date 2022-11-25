package com.OOP5;

import com.sun.jdi.Value;

public class Son extends Parent {
    // The body of career() is provided here
    @Override
    void career() {
        System.out.println("i want to become coder");
    }

    // The body of career() is provided here
    @Override
    void partner() {
        System.out.println("I love katrina");
    }

    @Override
    void normal() {
        super.normal();
    }

    public Son(int age) {
        super(age);
        //super(VALUE);

    }
}
