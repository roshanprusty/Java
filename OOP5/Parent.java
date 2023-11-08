package com.OOP5;

public abstract class Parent {
    int member;

    public Parent(int member) {
        this.member = member;
    }

    //you cannot create abstract constructor

    void greetings(){
        System.out.println("Am alright!!");
    }

    abstract void carrer();
    abstract void partner();

    void house(){
        System.out.println("Property worth 12Cr");
    }
}
