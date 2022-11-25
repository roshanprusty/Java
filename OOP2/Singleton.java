package com.OOP2;

public class Singleton {

    //private --> if there is private then it will only allow to run in that class.

    private Singleton() {

    }

    //create an object of Singleton
    private static Singleton instance;

    //as it is allowed to make object in this class.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
