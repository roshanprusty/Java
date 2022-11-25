package com.array2;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        int target=2;
        System.out.println("at Index: "+ceiling(arr,target));
    }

    //	ceiling = return the smallest element in array greater or equal to target
    static int ceiling(int[] arr, int target){
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
        return start;

    }
}
