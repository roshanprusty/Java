package com.roshan;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any num");
        int num= input.nextInt();
        if (num%2 == 0)
        {
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }
    }
}
