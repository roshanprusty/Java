package com.Template.TwoDimensional;

import java.util.Arrays;

public class Rotate {
    public static int[][] rotate(int[][] arr){
        int size = arr.length-1;
        //here we will use the transpose logic
        //Transpose
        for (int i = 0; i <=size; i++) {
            for (int j = i; j <=size; j++) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
            }
        }
        // Reverse along the main diagonal
        for (int i = 0; i <=size; i++) {
            for (int j = 0; j <=size/2; j++) {
                int temp=arr[i][j];
                arr[i][j]=arr[i][size-j];
                arr[i][size-j]=temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        arr=rotate(arr);
        System.out.println("----------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
