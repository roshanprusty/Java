package com.OOP2.Singleton;

public class Singleton {
    private Singleton() {

    }
    private static Singleton instance;

    //return type: Singleton
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
