package com.sem4;

public class TestThrow1 {
    public static void main(String[] args) {
        check(13);
    }

    static void check(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age not valid");
        } else {
            System.out.println("Welcome to Voting System");
        }
    }
}
