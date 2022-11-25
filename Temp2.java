//package com;
//public class Temp2 {
//    public static void main(String[] args) {
//        int[] arr={0,2,4,6,8,7,5,3,1};
//        int target =4;
//        findInMountainArray(arr,target);
//
//    }
//    static int findInMountainArray(int[] arr, int target){
//        int start=0;
//        int end=arr.length;
//        int mid = start+(end-start)/2;
//
//        while (start<end){
//            //ascending order
//            if(arr[mid]<arr[mid+1]){
//                start=mid+1;
//            }else {
//                //descending order
//                end=mid-1;
//            }
////            return end; //from here we can get pivot point
//        }
//
//    }
//}