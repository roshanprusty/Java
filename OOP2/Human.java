package com.OOP2;

import java.util.stream.Stream;

public class Human {
    String name;
    int age;
    static int population;

    public Human(String name, int age){
        this.name=name;
        this.age=age;
        Human.population+=1;
    }
    public static void greetings(){
//        System.out.println("Hi" +this.name); //error: static itself doesn't dependent upon object how can take value that dependent object
    }


}

