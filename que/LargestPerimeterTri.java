package com.que;

public class LargestPerimeterTri {
/*
- sum of any two sides should be greater than third side --> then   only triangle possible ---> there you the use formula
- where it is not possible return 0

Brief
nums = [2,1,2] --> 2+1>2 && 2+2>1 && 1+2>2 (T, T, T) --> 2+1+2=5
nums = [1,2,1] --> 1+2>1 && 1+1>2 && 2+1>1 (F, F, T) --> 0
*/
    public static void main(String[] args) {
        int[] nums={3,6,2,3};
        System.out.println(largestPerimeter(nums));
    }
    static int largestPerimeter(int[] nums){
        int temp;
//        int a,b,cl
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]>nums[i]){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for (int i = 0; i < nums.length-2; i++) {
            if(nums[i]+nums[i+1]>nums[i+2] && nums[i+1]+nums[i+2]>nums[i] && nums[i+2]+
                    nums[i]>nums[i+1]) return nums[i]+nums[i+1]+nums[i+2];
        }
        return 0;
    }
}

