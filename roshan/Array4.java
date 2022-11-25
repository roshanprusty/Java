package com.roshan;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr;  // declaration of array. ros is getting defined in stack
        arr=new int[5]; //creating object in heap memory
        for(int i=0; i<5; i++){
            System.out.println("enter the value for arr "+i);
            arr[i]=in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

    }
}
