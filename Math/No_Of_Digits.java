package com.Math;

import java.util.Scanner;

public class No_Of_Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int base = in.nextInt();

/*
--> You can count no of binary digits in this way
        int count=0;
        while (num>0){
            num>>=1;
            count++;
        }
*/
// --> Simplified way to find the no of digits is -->
        int count = (int)(Math.log(num)/ Math.log(base))+1;
        System.out.println(count);
    }
}
