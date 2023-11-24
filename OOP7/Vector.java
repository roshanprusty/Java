package com.OOP7;

import java.io.*;
import java.util.*;

public class Vector {
    public static void main(String[] args) {
        java.util.Vector<Integer> vector = new java.util.Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        System.out.println(vector);
    }

}
//It's almost same as ArrayList
//There is only difference is ArrayList can be access by multiple thread whereas in vector it cannot.
//https://www.geeksforgeeks.org/java-util-vector-class-java/
//if you are not dealing with multi thread, then you should prefer ArrayList
//ArrayList is prety faster
