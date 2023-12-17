package com.Template.TwoPointer;

//import java.util.ArrayList;
//import java.util.List;
//
//public class ThreeSum {
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5};
//        System.out.println(twoSum(arr,6));
//    }
//    public static List<List<Integer>> threeSum(int[] arr, int target){
//
//    }
//    public static List<List<Integer>> twoSum(int[] arr, int target){
//        List<List<Integer>> mainList = new ArrayList<>();
//        int i=0, j=arr.length-1;
//        while (i<j){
//            if(arr[i]+arr[j]==target) {
//                List<Integer> list = new ArrayList<>();
//                list.add(i);
//                list.add(j);
//                mainList.add(list);
//                i++;
//                j--;
//            }
//            else if(arr[i]+arr[j]>target){
//                j--;
//            }
//            else i++;
//        }
//        return mainList;
//    }
//}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Sort the array to simplify the solution
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Avoid duplicates
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int newTarget = target - nums[i];
                int left = i + 1;
                int right = nums.length - 1;

                // Call the separate twoSum function with the new target
                List<List<Integer>> twoSumResult = twoSum(nums, left, right, newTarget);

                // Convert the result to ArrayList before adding to the final result
                for (List<Integer> triplet : twoSumResult) {
                    List<Integer> newTriplet = new ArrayList<>(triplet);
                    newTriplet.add(0, nums[i]);
                    result.add(newTriplet);
                }
            }
        }

        return result;
    }

    private static List<List<Integer>> twoSum(int[] nums, int left, int right, int target) {
        List<List<Integer>> result = new ArrayList<>();

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                result.add(Arrays.asList(left, right));

                // Avoid duplicates
                while (left < right && nums[left] == nums[left + 1]) left++;
                while (left < right && nums[right] == nums[right - 1]) right--;

                left++;
                right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        int target = 0;
        List<List<Integer>> result = threeSum(nums, target);

        System.out.println("Three sum combinations:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}


