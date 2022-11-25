package com.Rec4;

import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        int[] arr ={2, 10, 11, 12, 6, 96};
        bubbleSort(arr);
    }
    static void bubbleSort(int[] arr){
        boolean swapped=false;
        for(int i =1; i<=arr.length-1; i++){ //it helps the j loop upto how much extend j loop has to go!
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped=true;
                }
            }
        }
        //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
        if(!swapped) return;
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[]arr, int j, int j1) {
        int temp = arr[j];
        arr[j]=arr[j1];
        arr[j1]=temp;
    }

}
