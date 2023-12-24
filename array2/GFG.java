package com.array2;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class GFG {
    public static void main(String[] args) {
         int[] arr ={1, 1,2,3,4,5,6, 6, 6, 7,8,9};
        System.out.println(countOccurrences(arr,1));
    }
    public static int peak(int[] arr){
//        https://www.geeksforgeeks.org/find-a-peak-in-a-given-array/
        int start=0, end=arr.length-1;
        int mid=0;
        while (start<end){
            mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //asc
                end=mid;
            }
            else{
                //asc
                start=mid+1;
            }
        }
        return arr[mid];
    }
    public static int[] reverse(int[] arr){
        int size = arr.length;
        int count=0;
        while (count<=size/2){
            int temp=arr[count];
            arr[count]=arr[(size-1)-count];
            arr[(size-1)-count]=temp;
            count++;
        }
        return arr;
    }
    public static int kthLargest(int[] arr, int k){
//        https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : arr) {
            maxHeap.add(num);
        }
        int ans=-1;
        for (int i = 0; i < k; i++) {
            ans=maxHeap.remove();
        }
        return ans;
    }
    public static int kthSmallest(int[] arr, int k){
//        https://www.geeksforgeeks.org/kth-smallest-largest-element-in-unsorted-array/
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList()));
        int ans=-1;
        for (int i = 0; i < k; i++) {
            ans=minHeap.remove();
        }
        return ans;
    }
    public static int countOccurrences(int[] arr, int x) {
//        https://www.geeksforgeeks.org/count-number-of-occurrences-or-frequency-in-a-sorted-array/
        int start = 0, end = arr.length - 1, mid = 0, count = 0;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == x) {
                count++;

                // Check the left side of the array
                int left = mid - 1;
                while (left >= 0 && arr[left] == x) {
                    count++;
                    left--;
                }

                // Check the right side of the array
                int right = mid + 1;
                while (right < arr.length && arr[right] == x) {
                    count++;
                    right++;
                }

                return count;
            }

            if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0; // Element not found
    }



}
