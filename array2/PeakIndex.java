package com.array2;

import java.util.Arrays;

public class PeakIndex {
    public static void main(String[] args) {
        int[] arr = {10,11,12,13,14,15,9,5,4,3,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int ans = 0, temp, start = 0, end = arr.length-1;
//        int mid = start + (end - start) / 2;
        while (start<end) {
            int mid =start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of array
                //this may be the ans, but you look left
                //this is why end!= mid-1
                end=mid;
            }else{
                //you are asc part of the array
                start=mid+1; //because we know that mid+1 element > mid element
            }

        }
        //in the end, start == end and pointing to the largest number because of the 2 checks above 3
        //start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the check say
        // more elaboration : at every point of time for start and end, they have the best possible answer till that time.
        // and if we are saying that only item is remaning , hence cuz of the above line is the best possible ans.
        return end; //return end or start
    }
}
