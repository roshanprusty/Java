package com.string;

public class Subsequence {
    public static void main(String[] args) {
        String Str = new String("Welcome to world");

        System.out.print("Return Value :" );
        System.out.println(Str.subSequence(0, 10) );

        System.out.print("Return Value :" );
        System.out.println(Str.subSequence(10, 15) );
    }
}
