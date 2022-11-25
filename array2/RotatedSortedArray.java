package com.array2;

public class RotatedSortedArray {
    public static void main(String[] args) {
      int[] nums = {10,11,12,13,14,15,0,1,2};
      int target = 2;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums, int target) {
        int ind = index(nums);
        if(binarySearchAes(nums,target,0,ind) != -1){
            return binarySearchAes(nums,target,0,ind);
        }else if(binarySearchDes(nums, target,ind,nums.length-1) != -1){
            return binarySearchDes(nums, target,ind,nums.length-1);
        }
        return -1;

    }
    static int index(int[] arr){

        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return end;
    }
    static int binarySearchAes(int[] arr, int target, int start, int end){
//        int start=0;
//        int end=arr.length-1;

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
    static int binarySearchDes(int[] arr, int target, int start, int end){
        while (start<=end){
            //find the middle element
            //int mid = (start + end) / 2; --> might be possible that (start + end) exceeds the range of integer
            int mid = start + (end- start)/2;
            if(target<arr[mid]){
                start=mid+1;
            }else if(target>arr[mid]){
                end=mid-1;
            }else {
                //ans found
                return mid;
            }
        }
        return -1;

    }
}
