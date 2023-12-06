package com.Template.TwoDimensional;

import java.util.*;

public class Diagonal {
    public static int[] diagonal(int[][] arr) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();

        // Loop through the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int key = i + j;
                hm.put(key, hm.getOrDefault(key, new ArrayList<>()));
                hm.get(key).add(arr[i][j]);
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length + arr[0].length - 1; i++) {
            Collections.reverse(hm.get(i));
            result.addAll(hm.get(i));
        }

        int[] intArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intArray[i] = result.get(i);
        }

        return intArray;
    }
    static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the center
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};

        //reverse krna rehe gya.
        System.out.println(Arrays.toString(diagonal(arr)));
    }
}
