package com.OOP5;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    //you cannot create abstract constructor

    static void greetings(){
        System.out.println("Am alright!!");
    }

    abstract void carrer();
    abstract void partner();

    void house(){
        System.out.println("Checking purpose");
    }
}
