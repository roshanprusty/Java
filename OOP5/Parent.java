package com.OOP5;

//Abstract class: is a restricted class that cannot be used to create objects
// (to access it, it must be inherited from another class).
public abstract class Parent {

//Abstract method: can only be used in an abstract class, and it does not
// have a body. The body is provided by the subclass (inherited from).
    abstract void career();
    abstract void partner();

    //it will work
    static void hello(){
        System.out.println("hello");
    }
    //it will work
    void normal(){
        System.out.println("Normal method");
    }

    int age;
    final int VALUE;
    public Parent(int age) {
        this.age = age;
        VALUE=455;
    }
}
