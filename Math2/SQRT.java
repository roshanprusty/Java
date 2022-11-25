package com.Math2;

import java.util.Scanner;

public class SQRT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("The sqrt of a given num is "+sqrt(num));
    }

    static int sqrt(int num) {
        int sr = (int)Math.sqrt(num);
        int a = sr*sr;
        int b = (sr+1)*(sr+1);
        if((num-a)<(b-num))
            return (int)Math.sqrt(a);
        else return (int)Math.sqrt(b);
    }
}
