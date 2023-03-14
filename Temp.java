package com;
public class Temp {
    public static void main(String[] args) {
        String[] nums = {"777","7","77","77"};
        String target = "7777";
        System.out.println(numOfPairs(nums,target));
    }
    static int numOfPairs(String[] nums, String target) {
        int count=0;
        int numLen =nums.length;
        for(int i=0; i<numLen; i++){
            for(int j=0;j<numLen;j++){
                if(i==j) continue;
                String check =nums[i]+nums[j];
                if(target.equals(check)){
                    count++;
                }
            }
        }
        return count;
    }
}
