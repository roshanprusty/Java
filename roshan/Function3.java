package com.roshan;

import java.util.Scanner;

public class Function3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1=in.nextInt();
        System.out.print("Enter the num2: ");
        int num2= in.nextInt();
        sum(num1,num2);

        int ans=sub(num1,num2);
        System.out.println("the sub of given num is " + ans);
    }
    static void sum(int num1, int num2){
        int sum=num1+num2;
        System.out.println("the sum of given num is " + sum);
    }
    static int sub(int num1, int num2){
        return num1-num2;

    }
}
