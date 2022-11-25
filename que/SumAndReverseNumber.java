package com.que;

import java.util.Scanner;

public class SumAndReverseNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        sumAndReverseANumber(num);
    }
    public static void sumAndReverseANumber (int number){
        int temp=number;
        int rem,rev=0,sum=0;
        while(temp>0){
            //rev
            rem=temp%10;
            rev=rev*10+rem;
            temp/=10;
            //sum
            sum+=rem;
        }
        System.out.println("Sum of digits : "+sum);
        System.out.println("Reverse : "+rev);
    }
}
