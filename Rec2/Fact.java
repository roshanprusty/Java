package com.Rec2;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        //
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(factorial(num));

    }
    static int factorial(int num){
        //base condition
        if(num==1)
            return 1;
        //recurrence formula
        return num * factorial(num-1);
    }
}
