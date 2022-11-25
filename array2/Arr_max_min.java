package com.array2;

import java.util.Scanner;

public class Arr_max_min {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value of arr "+i);
            arr[i]=in.nextInt();
        }
        System.out.println("the maximum value in given array: "+max(arr));

    }
    static int max(int[] arr){
        int maxi=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>maxi){
                maxi=arr[i];
            }
        }
        return maxi;
    }
    static int min(int[] arr){
        int mini=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<mini){
                mini=arr[i];
            }
        }
        return mini;
    }
}
