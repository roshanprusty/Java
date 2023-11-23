package com.OOP6.ObjectCloning;

public class Sample {
    String name;
    int age;

    public Sample(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Sample(Sample s){
        this.name=s.name;
        this.age=s.age;
    }
}
