package com.Math;

import java.util.Scanner;

public class Reset_Ith_Bit2 {
    public static void main(String[] args) {
        //1 -> 0
        //0 -> 0
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int place = in.nextInt();
        System.out.println(Integer.toBinaryString(resetIthBit2(num,place)));
    }

    static int resetIthBit2(int num, int place) {
    int ans;
    ans=num&~(1<<(place-1));
    return ans;
    }
}
