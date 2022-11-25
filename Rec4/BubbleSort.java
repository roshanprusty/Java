package com.Rec4;

import java.util.Arrays;
import java.util.Stack;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={2,3,9,5,4,44,42,41};
        bS(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    static void bS(int arr[], int n)
    {
        // Base condition
        if (n == 1)
            return;

        // One pass of bubble sort. After
        // this pass, the largest element
        // is moved (or bubbled) to end.
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }

        // Largest element is fixed,
        // recur for remaining array
       bS(arr, n-1);

    }
}
