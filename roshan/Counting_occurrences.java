package com.roshan;

import java.util.Scanner;

public class Counting_occurrences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int rem,count=0;
        while(num>0){
            rem=num%10;
            if (rem == 3)
            {
                count++;
            }
            num=num/10;
        }
        System.out.println(count);


    }
}
