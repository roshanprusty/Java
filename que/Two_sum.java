package com.que;

import java.util.Arrays;

public class Two_sum {
    public static void main(String[] args) {
        int arr[] = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(arr,target)));


    }
    static int[] twoSum(int[] nums, int target) {
        int i=0,j=0;
        aa:
        for (i = 0; i < nums.length; i++) {
            for (j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    break aa;
                }
            }
        }
//        int[] arr={i,j};
//        return arr;     //returns array
        return new int[]{i,j};
    }
}

/*
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++){
            if (map.containsKey(target - nums[i])){
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }else{
                map.put(nums[i], i);
            }
        }
        return res;
    }
}
*/
