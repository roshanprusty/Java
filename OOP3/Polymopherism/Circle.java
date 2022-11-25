package com.OOP3.Polymopherism;

public class Circle extends Shape{
    //this will run when obj of circle is created
    //hence it is overriding the parent method
    @Override //this is called annotation //use for check purposes
    void area(){
        System.out.println("pi * r * r");
    }
}
