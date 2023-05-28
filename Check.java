package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Check {
    public static void main(String[] args) {
        int []nums = {3};
        System.out.println(singleNonDuplicate(nums));


    }
    static int singleNonDuplicate(int[] nums) {
        int low =0;
        int high = nums.length-1;
        if(high==0) return nums[high];
        if(nums[low]!=nums[low+1]) return nums[low];
        if(nums[high]!=nums[high-1]) return nums[high];
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) return nums[mid];
            //even
            if(mid%2==0 && nums[mid]==nums[mid+1]) low=mid+1;
            else if(mid%2!=0 && nums[mid]==nums[mid-1]) low=mid+1;
            else high=mid-1;
        }
        return -1;
    }
}
