package com.CodeTemplate.TwoPointer;

import java.util.Arrays;

public class Collision {
    public static void main(String[] args) {
        int[] arr ={2,7,11,15};
        int[] ans= new int[2];
        int target=9;
        int i=0, j=arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
            else if(arr[i]+arr[j]>target) j--;
            else i++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
