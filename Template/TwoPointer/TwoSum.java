package com.CodeTemplate.TwoPointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        int ptr=0, ptr2=arr.length-1;
        int[] ans= new int[2];
        while (ptr<ptr2){
            if(arr[ptr]+arr[ptr2]==target){
                ans[0]=ptr+1;
                ans[1]=ptr2+1;
                break;
            }
            if(arr[ptr]+arr[ptr2]>target) ptr2--;
            else ptr++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
