package com.Math2;

import java.util.Scanner;

public class Prime_range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int range1= in.nextInt();
        int range2 = in.nextInt();
        for (int i = range1; i <=range2; i++) {
            if(i == 0){
                System.out.println(i+" is neither prime nor composite");
                continue;
            }
            System.out.println(i+" "+ isprime(i));
        }
    }

    static boolean isprime(int num) {

        if(num == 1) return false;

        int newNum;
        int sr =(int)Math.sqrt(num);
        int a =sr*sr;
        int b =(sr+1)*(sr+1);

        if((num-a)<(b-num))
            newNum=a;
        else newNum=b;

        for (int i = 2; i <=Math.sqrt(newNum) ; i++) {
            boolean prime=true;
            for (int j = 2; j < i/2; j++) {
                if(i%j==0) prime=false;
            }
            if(prime && num%i==0) return false;
        }
        return true;
    }
}
