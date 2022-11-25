package com.que;
import java.util.Arrays;
public class LeetCode1502 {
    public static void main(String[] args) {
        int[] arr={3,5,1};
        System.out.println(canMakeArithmeticProgression(arr));
    }
    static  boolean canMakeArithmeticProgression(int[] arr){
        int diff;
//        boolean check;
        Arrays.sort(arr);
        diff=arr[1]-arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]!=diff) return false;
        }
        return true;
    }
}
