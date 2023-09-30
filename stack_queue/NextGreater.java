package com.stack_queue;

public class NextGreater {
    public static void nextGreater(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j]){
                    System.out.println(arr[i]+" -> "+arr[j]);
                    break;
                }
                if(j==arr.length-1)  System.out.println(arr[arr.length-1]+" -> -1");
            }
        }
        System.out.println(arr[arr.length-1]+" -> -1");
    }
    public static void nextGreaterStack(int[] arr){

    }
    public static void main(String[] args) {
        int[] arr = { 13 , 7, 6 , 12  };
        nextGreater(arr);
    }
}
