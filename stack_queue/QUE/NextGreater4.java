package com.stack_queue.QUE;

import java.util.Arrays;
import java.util.Stack;

public class NextGreater4 {
    public static int[] forLoop(int[] arr){
        int[] ans=new int[arr.length];
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]<arr[j]) {
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        ans[arr.length-1]=-1;
        return ans;
    }
    public static int[] NGE(int arr[]) {
        Stack<Integer> stack= new Stack<>();
        int[] ans=new int[arr.length];
        stack.push(0);
        for (int i = 1; i < arr.length; i++) {
            if(stack.isEmpty()) stack.push(arr[i]);
            while (!stack.isEmpty() && arr[stack.peek()]<arr[i]){
                ans[stack.peek()]=arr[i];
                stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
public static void main(String[] args) {
        int[] arr={4 , 5 , 2 , 25};
//        System.out.println(Arrays.toString(forLoop(arr)));
    System.out.println(Arrays.toString(NGE(arr)));
    }
}
