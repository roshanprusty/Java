package com.Math;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println(isOdd(num));
    }

    static boolean isOdd(int num) {
        return (num&1)==1;
    }
}
