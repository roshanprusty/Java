package com.OOPsPratice;

public class InnerClass {
    static String country;
    static String nativeLanguage;
    int phoneNumber;

    public InnerClass(String country) {
        InnerClass.country = country;
    }
    public InnerClass(){}

    public static class Class{
        String name;
        int uid;

        public Class(String name, int uid) {
            this.name = name;
            this.uid = uid;
        }
    }
    static void greetings(){
        System.out.println("Hello, Good Morning Humans!");
    }
}
