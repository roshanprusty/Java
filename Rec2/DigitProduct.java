package com.Rec2;

import java.util.Scanner;

public class DigitProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(productOfIndividualDigit(num));
    }

    static int productOfIndividualDigit(int num) {
        //base condition
        if(num%10 == num) return num;
        return (num%10) * productOfIndividualDigit(num/10);
    }
}
