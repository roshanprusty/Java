package com.OOP2.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton temp = Singleton.getInstance();
        Singleton temp2 = Singleton.getInstance(); //error
        Singleton temp3 = Singleton.getInstance(); //error
    }
}
