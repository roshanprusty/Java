package com.array2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,6,4};
        System.out.println(findInMtArr(arr,11));


    }
    static int findInMtArr(int[] arr, int target){
        int peak=mtArr(arr);
        target=bs_Asc(arr,target,0,peak);
        if(target==-1) bs_Dsc(arr,target,peak,arr.length-1);
        return target;
    }
    static int mtArr(int[] arr){
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]) end=mid;
            else start=mid+1;
        }
        return end;
    }
    static int bs_Asc(int[] arr, int target, int s, int e){
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>target) e=m-1;
            else if(arr[m]<target) s=m+1;
            else return m;
        }
        return -1;
    }
    static int bs_Dsc(int[] arr, int target, int s, int e){
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]>target) s=m+1;
            else if(arr[m]<target) e=m-1;
            else return m;
        }
        return -1;
    }

    }
