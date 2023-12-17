package com.array2.searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {2, 3, 15, 15, 14, 16, 18};
        int target=15;
        System.out.println(binarySearch(arr,target));
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
