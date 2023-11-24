package com.OOPsPratice;

public class Main {
    public static void main(String[] args) {
        InnerClass ic = new InnerClass("india");
        InnerClass.Class c = new InnerClass.Class("Roshan", 123);
        InnerClass.greetings();
        System.out.println(ic.country);
        ic.nativeLanguage="Odia";
        System.out.println(ic.nativeLanguage);
        InnerClass ic2 = new InnerClass();
        System.out.println(ic2.nativeLanguage);
        ic.phoneNumber=123;
        System.out.println(ic.phoneNumber);
        System.out.println(ic2.phoneNumber);
        //hope so everyone understood now;
    }
}
