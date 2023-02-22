package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1};
        System.out.println(numOfSubarrays(arr,1,0));


    }
    static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        for(int i=k-1;i<arr.length;i++){
            int avg=arr[i]+arr[(i-1)]+arr[(i-2)];
            avg/=k;
            if(avg>=threshold) count++;
        }
        return count;
    }


}