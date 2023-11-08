package com.OOP5;

public class StepDaughter extends Parent {
    int age;
    public StepDaughter(int member, int age) {
        super(member);
        this.age=age;
    }

    @Override
    void carrer(){
        System.out.println("Doctor");
    }

    @Override
    void partner(){
        System.out.println("Business man");
    }

    void greetings(){
        System.out.println("sD");
    }
    void sayHi(){
        System.out.println("say Hi");
    }
}
