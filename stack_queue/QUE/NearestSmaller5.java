package com.stack_queue.QUE;

import java.util.Arrays;
import java.util.Stack;

public class NearestSmaller5 {
//    https://www.geeksforgeeks.org/find-the-nearest-smaller-numbers-on-left-side-in-an-array/
//     Find the nearest smaller numbers on left side in an array

    public static int[] nearestSmallest(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans= new int[arr.length];
        stack.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek()>=arr[i]){
                stack.pop();
            }
            if(!stack.isEmpty()) ans[i]= stack.peek();
            stack.push(arr[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1, 6, 4, 10, 2, 5};
        System.out.println(Arrays.toString(nearestSmallest(arr)));
    }
}
