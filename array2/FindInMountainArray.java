package com.array2;

public class FindInMountainArray {
    public static void main(String[] args) {
       int[] array = {4,1,2};
       int target = 3;
//        System.out.println(findInMountainArray(array,target));
        findInMountainArray(array,target);
    }
    static int findInMountainArray(int[] arr, int target){
        //check if the targeted element is there or not before pivot num if not then it checks after the pivot num
        int i = index(arr);
        System.out.println(i);
        if (binarySearchAes(arr,target,0,i) != -1){
            return binarySearchAes(arr,target,0,i);
        }else if(binarySearchDes(arr,target,i,arr.length-1) != -1){
            return binarySearchDes(arr,target,i,arr.length-1);
        }
        return -1;
    }
    static int index(int[] arr){
        //gives pivot num in the given array (pivot point : largest no)
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearchAes(int[] arr, int target,int start, int end){
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
