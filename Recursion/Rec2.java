package com.Recursion;

public class Rec2 {
    public static void main(String[] args) {

        System.out.println(print(1));
    }
    static int print(int num){
        //base condition
        if(num==5){
           return 5;
        }
        System.out.println(num);
        return print(num+1);
    }
}
