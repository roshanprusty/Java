package com.Recursion;

import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println(add(num1,num2));
    }

    static int add(int num1, int num2) {
        System.out.println("The addition of given num is ");
        return num1+num2;
    }
}
