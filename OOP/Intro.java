package com.OOP;

public class Intro {
    public static void main(String[] args) {
        Student roshan = new Student();
        roshan.rn=24;
        System.out.println(roshan.rn);

    }
    static class Student{
        int rn;
        int marks;
    }
}
