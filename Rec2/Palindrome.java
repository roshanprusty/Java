package com.Rec2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(palindrome(num));
    }
    static int reverse(int num, int noOfDigits) {
        //base condition
        if(num%10 == num) return num;
        noOfDigits--;
        return ((num%10)*(int)Math.pow(10,noOfDigits)) +  reverse(num/10,noOfDigits);

    }
    static boolean palindrome(int num) {
        int noOfDigits = (int)(Math.log10(num)+1);
        return reverse(num,noOfDigits)==num;
    }
}
