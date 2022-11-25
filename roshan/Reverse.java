package com.roshan;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int num= in.nextInt();
        int rem,ans=0;
        while (num>0){
            rem=num%10;
            ans=ans*10+rem;
            num=num/10;
        }
        System.out.println(ans);
    }
}
