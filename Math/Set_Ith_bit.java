package com.Math;

import java.util.Scanner;

public class Set_Ith_bit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int place=in.nextInt();
        System.out.println(Integer.toBinaryString(setIthBit(num,place)));
    }

    static int setIthBit(int num, int place) {
    int ans = num | (1<<(place-1));
    return ans;
    }
}
//1 -> 1
//0 -> 1