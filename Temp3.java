package com;

public class Temp3 {
    public static void main(String[] args) {
        int[] arr ={1,7,3,6,5,6};
        System.out.println(pivotIndex(arr));
    }
    public static int pivotIndex(int[] nums) {
        int right = 1;
        int left =nums.length-1;
        int fs=nums[0];
        int ls = 0;
        do {
            if(fs>ls){
                ls+=nums[right];
                right++;
            }
            if(ls>fs){
                fs+=nums[left];
                left--;
            }
            if(left==right) return 0;
            if((nums[left]==nums[right]) && (right+1 != left)) return left++;

        }while (fs!=ls);

        return -1;
    }


}
