package com.Recursion;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,66,67,68,69,71,78,79,88};
        int target=2;
        System.out.println(BSR(arr,target,0,arr.length-1));
    }
    static int BSR(int[] arr, int target, int start, int end){ 
        if(start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(target==arr[mid]) {
            return mid;
        }
        if(target<arr[mid]){
            return BSR(arr,target,start, mid-1);
        }
        return BSR(arr,target,mid+1, end);
    }
}
