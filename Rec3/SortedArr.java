package com.Rec3;

import java.util.Scanner;

public class SortedArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(isItSorted(arr,0));
    }

    static boolean isItSorted(int[] arr, int index) {
        //base condition
        if(index == arr.length-1) return true;

        return (arr[index] < arr[index+1]) && isItSorted(arr,index+1);
    }
}
