package com;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Temp {
    public static void main(String[] args) {
        Queue<Integer> que = new ArrayDeque<>();
        int[] arr = {1,2,3,4,5,6};
        int k=2;
        for (int i = 0; i < arr.length; i++) {
            que.add(arr[i]);
        }
        Arrays.fill(arr, 0);
        for (int i = k; i < arr.length ; i++) {
            arr[i]= que.remove();
        }
        for (int i = 0; i < k; i++) {
            arr[i]= que.remove();
        }
        System.out.println(Arrays.toString(arr));
    }
}
