package com.Rec2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        System.out.println(sum(num));
    }

    static int sum(int num) {
        //base condition
        if(num==1) return 1;
        return num + sum(num-1);
    }
}
