package com.roshan;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int target=3;
        System.out.println(Arrays.toString(searchRange(arr,target)));


    }
    static int[] searchRange(int[] nums, int target) {
            int[] ans={-1,-1};
            for(int i =0; i<nums.length;i++){
                if(nums[i]==target) {
                    ans[0] = i;
                    break;
                }
            }
            for(int i =nums.length-1; i>=0;i--){
                if(nums[i]==target) {
                    ans[1] = i;
                    break;
                }
            }
            return ans;
        }
    }


