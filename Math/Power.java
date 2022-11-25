package com.Math;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int power = in.nextInt();
        System.out.println(ans(base,power));
    }

    static int ans(int base, int power) {
        int ans =1;
        while (power>0){
            int last= power&1;
            if(last==1) {
                ans *= last * base;
            }
            power>>=1;
            base*=base;
        }
        return ans;
    }
}
