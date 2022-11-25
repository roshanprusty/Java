package com.array2;

public class OrderArgnosticBS {
    public static void main(String[] args) {
//        int[] arr= {2, 4, 6, 9, 11, 12, 14, 20, 36, 48};
        int[] arr2={7, 6, 5, 4, 2, 1, 0};

//        System.out.println(find(arr,12));
        System.out.println(find(arr2,4));
    }
    static int find(int[] arr, int target){
        int start=arr[0];
        int end=arr[arr.length-1];
        if(start>end){
            return binarySearchDes(arr,target);
        }
        if(start<end){
            return binarySearchAes(arr,target);
        }
        return -1;
    }
    static int binarySearchAes(int[] arr, int target){
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
    static int binarySearchDes(int[] arr, int target){
        int start=0;
        int end=arr.length-1;

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
