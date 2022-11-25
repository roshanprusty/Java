package com.Math;

import java.util.Scanner;

public class MagicNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int ans=0;
        int base=5;
        while (n>0){
            int last = n&1;
            n>>=1; //to iterate in binary part of a no.
            base*=5;
            ans+=last*base;
        }
        System.out.println(ans);
    }
}
