package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Temp2 {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr));

    }
    static List<List<Integer>> ans = new ArrayList<>();

    public static List<List<Integer>> threeSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
//            ans.add(twoSum(nums[i],i+1,nums));
            twoSum(nums[i],i+1,nums);
        }
        return ans;
    }
    public static  void twoSum (int val,int index, int[] arr){
//        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> part = new ArrayList<>();
        aa:
        for (int i = index; i < arr.length; i++) {
            if(val == arr[i]) continue aa;
            bb:
            for (int j = i+1; j < arr.length; j++) {
               if((val == arr[j]) && (arr[i]==arr[j])) continue bb;
               if((val+arr[i]+arr[j])==0){
                    part.add(index);
                   part.add(i);
                   part.add(j);
                   ans.add(part);
                   part.removeAll(part);
               }
            }
        }
    }
}