package com.Math;

import java.util.Scanner;

public class Ith_place {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num = in.nextInt();
        int place = in.nextInt();
        System.out.println(ith_place(num,place));
    }

     static int ith_place(int num, int place) {
        int ans= num&(1<<(place-1));
        if(ans==0) return 0;
        return 1;
    }

}
