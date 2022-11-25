package com.roshan;

import java.util.Scanner;

public class Prime3_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
//        System.out.println(isPrime(num));

    }
//    static boolean isPrime(int num){
//        boolean pri=true;
//
//        //square root of given number
//        double temp = Math.sqrt(num);
//
//    }



/*
     static boolean isPrime(int n){
         if (n <= 1) {
             return false;
         }
             int c = 2;
             while (c * c <= n) {
                 if (n % c == 0) {
                     return false;
                 }
                 c++;
             }
/*
         if (c * c > n) {
             return true;
         }
         return false;
* /
         return c * c > n;

     }
*/
}
