package com.string;

import java.util.Arrays;

public class St {
    public static void main(String[] args) {


        String name1 = new String("Roshan");
        String name2 = new String("Roshan");
        System.out.println(name1==name2); //false
        System.out.println(name1.equals(name2));//true

        String a ="hello";
        String b ="hello";
        System.out.println(a==b); //true
        System.out.println(a.equals(b));//true
        System.out.println(a.charAt(0)); //h

    }
}


