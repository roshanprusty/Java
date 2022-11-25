package com.Rec4;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={1,3,2,4,7,5,6};
        sS(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sS(int[] arr, int k){
        int max=arr[0];
        boolean flag=false;
        int maxI=0;
        //base condition
        if(k==0) return;
        for (int i = 0; i <=k; i++) {
            if(arr[i]>max){
                max=arr[i];
                flag=true;
                maxI=i;
            }
        }
        if(flag){
            swap(arr,maxI,k);
        }
        sS(arr,k-1);
    }
    static void swap(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
