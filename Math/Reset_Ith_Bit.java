package com.Math;

import java.util.Scanner;

public class Reset_Ith_Bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int place = in.nextInt();
        System.out.println(Integer.toBinaryString(reset(num, place)));
    }

    static int reset(int num, int place) {
        int ans = (num & ~(1 << (place - 1)));
        return ans;
    }
}
//1 -> 0
//0 -> 1
