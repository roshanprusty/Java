package com.Rec2;

import java.util.Scanner;

public class DigitSum{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(sumOfIndivdualDigits(num));
    }

    static int sumOfIndivdualDigits(int num) {
        //base condition
        if(num<=0)
            return 0;
        return (num%10) + sumOfIndivdualDigits(num/10);
    }
}
