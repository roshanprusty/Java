package com.Rec2;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int noOfDigits = (int)(Math.log10(num)+1);
        System.out.println(reverse(num,noOfDigits));
    }

    static int reverse(int num, int noOfDigits) {
       //base condition
        if(num%10 == num) return num;
        noOfDigits--;
        return ((num%10)*(int)Math.pow(10,noOfDigits)) +  reverse(num/10,noOfDigits);

    }
}
