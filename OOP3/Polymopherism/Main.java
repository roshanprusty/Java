package com.OOP3.Polymopherism;

public class Main {
    public static void main(String[] args) {
//        Shape shape = new Shape();
//        Circle circle = new Circle();
//        circle.area();
//        Shape shape = new Square();
//        shape.greetings();  // Hello Buddy, I am from Shape class

        Shape shape = new Square();
        shape.greetings();  // Hello Buddy, I am from Shape class

        Square square = new Square();
        square.greetings();  // Hello Buddy, I am from Shape class
                             //if there will be function greetings in Square class then it would be : Hello Buddy, I am from Square class

    }
}
