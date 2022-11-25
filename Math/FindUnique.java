package com.Math;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr={2,2,3,3,7,1,8,1,8};
        System.out.println(unique(arr));
    }
    static int unique(int[] arr) {
        int unique=0;
        for (int num:arr)
            unique^=num;
        return unique;
    }
}
