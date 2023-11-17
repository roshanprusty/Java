package com.OOPsPratice;

public interface InterfaceB {
    void func();
    default void greeting(){
        System.out.println("Hi, I am from InterfaceB");
    }
    static void newYear(){
        System.out.println("New Year is coming!");
    }
}
