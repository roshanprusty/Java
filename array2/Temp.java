package com.array2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Temp {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(searchInfiniteArr(arr,5));

    }
    static int searchInfiniteArr(int [] nums, int target){
        int start=0;
        int end =2;
        int mid = start+(end-start)/2;
        int ans=-1;
        while (target>nums[end]){
            end= end+(end - start +1)*2;
        }
        return binarySearch(nums,target);
    }
    static int binarySearch(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            //find the middle element
            //int mid = (start + end) / 2; --> might be possible that (start + end) exceeds the range of integer
            int mid = start + (end- start)/2;
            if(target<arr[mid]){
                end=mid-1;

            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;

    }
    }
