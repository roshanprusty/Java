package com.array2;

public class Infinite_sorted_array {
    public static void main(String[] args) {
        int[] arr ={2,3,5,6,7,8,10,11,12,15,20,23,30};
        int target=5;
        System.out.println(ans(arr,target));

    }
    static int ans(int arr[], int target){
        //start with the box of size 2
        //first start with a box of size 2;
        int start=0;
        int end =1;
        while(target>arr[end]){
            int temp = end+1; //this is my new start
            //double the box value
            //end =  previous end + sizeofbox*2
            end= end+(end - start +1)*2; //size of box  = end - start +1
            start=temp;

        }
        return binarySearch(arr,target,start,end);

    }
    static int binarySearch(int[] arr, int target,int start, int end){
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
}
