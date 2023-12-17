package com.OOP;

public class Temp {
    int val;
    String name;
    private static Temp temp;
    private Temp(int val, String name){
        this.val=val;
        this.name=name;
    }
    public static Temp getInstance(int val, String name){
        if(temp==null){
            return temp = new Temp(val, name);
        }
        else throw new RuntimeException();
    }

}