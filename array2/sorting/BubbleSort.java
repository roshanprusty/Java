package com.array2.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={10, 2, 66, 12, 96, 11};
        bubbleSort(arr);
    }
    static void bubbleSort(int[] arr){
        int temp;
        boolean swapped=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1 ; j < arr.length; j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
