package com.Math2;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num) {
        int newNum;
        boolean flag;

        //perfect sqrt of a give num
        int a = (int)(Math.sqrt(num)*Math.sqrt(num)) ;
        int b = (int)((Math.sqrt(num)+1)*(Math.sqrt(num)+1));

        if((num-a)<(b-num)){
            newNum=a;
        }else
            newNum=b;

        for (int i = 2; i <=Math.sqrt(newNum); i++) {
            boolean prime=true;

            // whether the i is prime or not -->
            for (int j = 2; j <i/2 ; j++) {
               if(i%j==0)
                   prime=false;
            }
            //check whether the no. is divisible by prime no. or not
            //if yes return false
            //if no return true
            if(prime && num%i==0)
                return false;
        }
        return true;
    }
}
