package com.OOP3.Polymopherism;

public class Square extends Shape{
    @Override
    void area(){
        System.out.println("I am from the square class");
    }

    static void greetings(){
        System.out.println("Hello Buddy, I am from Square class ");
    }

}
