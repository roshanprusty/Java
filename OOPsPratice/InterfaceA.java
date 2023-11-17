package com.OOPsPratice;

public interface InterfaceA {
    void func();
    default void greeting(){
        System.out.println("Hi, I am from InterfaceA");
    }
    static void newYear(){
        System.out.println("New Year is coming!");
    }

}
