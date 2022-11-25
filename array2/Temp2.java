package com.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Temp2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        System.out.println(reverse(x));
    }
    static int reverse(int x) {
        long ans=0,rem;
//        long digits =(int)(Math.log10(x)) + 1;

        while (x>0){
            rem=x%10;
            x/=10;
            ans=rem+(ans*10);
        }
        while (x<0){
            rem=x%10;
            x/=10;
            ans=rem+ans*10;
        }

        if(ans>Math.pow(2,31)-1 || ans<=Math.pow(-2,31))
            return 0;

        return (int)ans;
    }
}
