package com.array2;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value of arr "+i);
            arr[i]=in.nextInt();
        }
        System.out.println("Before: "+Arrays.toString(arr));
        swap(arr,1,3);
        System.out.println("After: "+Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
