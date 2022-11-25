package com.OOP3.Polymopherism;

public class Square extends Shape{
    void area(){
        System.out.println("a*a");
    }
/*
    @Override --> Overriding depends upon object
                  static does no0t depends upon object
                  Hence static method can't be overridden.
*/
//    static void greetings(){
//        System.out.println("Hello Buddy, I am from square class ");
//    }
}
