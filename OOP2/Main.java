package com.OOP2;

import com.OOP2.Singleton.Singleton;

public class Main {
    public static void main(String[] args) {

//        Singleton obj = new Singleton(); //throwing error

//        we are able to make the object ---> just for one time.
        Singleton obj1= Singleton.getInstance();
//        2.
        Singleton obj2= Singleton.getInstance();
//        3.
        Singleton obj3= Singleton.getInstance();

//        and other objects are pointing to first object only


    }
}
