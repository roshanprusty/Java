package com.OOP3.Polymopherism;

public class Main {
    public static void main(String[] args) {
       Shape shape = new Square();
       shape.greetings(); //Hello Buddy, I am from shape class  :|)
                          //This happens because In box class greeting method called as static.
                          //and as we all know if it is static it means its independent.
                          //so when we call it will run no matter which object calls
    }
}
